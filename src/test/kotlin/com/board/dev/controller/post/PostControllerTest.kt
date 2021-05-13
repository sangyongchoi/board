package com.board.dev.controller.post

import com.board.dev.domain.post.service.PostService
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.BDDMockito.any
import org.mockito.BDDMockito.given
import org.mockito.Mockito
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
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import java.time.LocalDateTime

@AutoConfigureRestDocs
@WebMvcTest(PostController::class)
@ExtendWith(RestDocumentationExtension::class)
internal class PostControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @MockBean
    lateinit var postService: PostService

    val objectMapper = ObjectMapper()

    init {
        objectMapper.registerModule(JavaTimeModule())
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
    }

    private fun <T> any(): T {
        Mockito.any<T>()
        return null as T
    }

    //@Test
    fun `글 작성 Docs 생성`() {
        given(postService.write(any())).willReturn(1L)

        val postInfo = PostRequestDto.PostInfo("test", 10, LocalDateTime.now(), LocalDateTime.now(), "테스트")
        print(objectMapper.writeValueAsString(postInfo))
        val result = mockMvc.perform(
            post("/post")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(postInfo))
        )

        result
            .andDo(print())
            .andDo(
                document(
                    "post",
                    requestFields(
                        fieldWithPath("writerId").type(JsonFieldType.STRING).description("작성자 아이디"),
                        fieldWithPath("homeSize").type(JsonFieldType.NUMBER).description("시공 면적"),
                        fieldWithPath("startDate").type(JsonFieldType.STRING).description("시공 시작 날짜"),
                        fieldWithPath("endDate").type(JsonFieldType.STRING).description("시공 마감 날짜"),
                        fieldWithPath("requirements").type(JsonFieldType.STRING).description("요구사항")
                    ),
                    responseFields(
                        fieldWithPath("id").type(JsonFieldType.NUMBER).description("요청 번호")
                    )
                )
            )
    }
}