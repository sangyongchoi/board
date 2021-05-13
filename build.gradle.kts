import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.4.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("org.asciidoctor.convert") version "2.4.0"
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.spring") version "1.4.32"
    kotlin("plugin.jpa") version "1.4.32"
    kotlin("kapt") version "1.4.10"
}

group = "com.board"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

val queryDsl  = "4.3.1"

ext {
    set("snippetsDir", file("build/generated-snippets"))
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("io.jsonwebtoken:jjwt:0.9.1")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.querydsl:querydsl-jpa")
    runtimeOnly("com.h2database:h2")

    kapt("com.querydsl:querydsl-apt::jpa")

    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor(group = "com.querydsl", name = "querydsl-apt", classifier = "jpa")

    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")
}

sourceSets["main"].withConvention(org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet::class){
    kotlin.srcDir("$buildDir/generated/source/kapt/main")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks {
    asciidoctor {
        dependsOn(test)
        inputs.dir(ext.get("snippetsDir") as File)

        doFirst {
            delete(file("src/main/resources/static/docs"))
        }

        doLast {
            println("===== END asciidoctor GENERATE =======")
        }
    }

    register("copyDocument", Copy::class) {
        dependsOn(asciidoctor)
        from("build/asciidoc/html5")
        into("src/main/resources/static/docs")
    }

    build {
        dependsOn(":copyDocument")
    }

    bootJar {
        dependsOn(asciidoctor)
        from ("${asciidoctor.get().outputDir}/html5") {
            into("BOOT-INF/classes/static/docs")
        }
        archiveFileName.set("app.jar")
    }
}
