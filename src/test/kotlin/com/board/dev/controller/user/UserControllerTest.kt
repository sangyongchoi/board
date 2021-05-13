package com.board.dev.controller.user

import com.board.dev.domain.user.service.UserService
import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.restdocs.RestDocumentationExtension
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post
import org.springframework.restdocs.payload.JsonFieldType
import org.springframework.restdocs.payload.PayloadDocumentation.*
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.MockMvc

@AutoConfigureRestDocs
@WebMvcTest(UserController::class)
@ExtendWith(RestDocumentationExtension::class)
internal class UserControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var userService: UserService

    val objectMapper: ObjectMapper = ObjectMapper()

    @Test
    fun mockMvc_notNull() {
        assertNotNull(mockMvc)
    }

    @Test
    fun `회원가입`() {
        val requestTest = UserRequestDto.RegisterUser("ddd", "ddd", "ddd", 0)

        val result = mockMvc.perform(
            post("/signup")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(requestTest))
        )

        result
            .andDo(print())
            .andDo(
                document(
                    "user",
                    requestFields(
                        fieldWithPath("id").type(JsonFieldType.STRING).description("아이디"),
                        fieldWithPath("password").type(JsonFieldType.STRING).description("비밀번호"),
                        fieldWithPath("name").type(JsonFieldType.STRING).description("이름"),
                        fieldWithPath("type").type(JsonFieldType.NUMBER).description("역할 (유저, 전문가)")
                    )
                )
            )
    }
}