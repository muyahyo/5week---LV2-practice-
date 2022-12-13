package com.sparta.hanghaememo.controller;

import com.sparta.hanghaememo.dto.*;
import com.sparta.hanghaememo.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comment/{id}")
    public CommentResponseDto createComment(@RequestBody CommentRequestDto requestDto, HttpServletRequest request) {
        return CommentService.createComment(requestDto, request);
                             // ↑ 이 친구들 왜 PostService와 똑같은 코드를 사용 했음에도 불구하고 저런 문구가 뜨는지 궁금합니다.
                            //비 static 메서드 'createComment(com.sparta.hanghaememo.dto.CommentRequestDto, javax.servlet.http.HttpServletRequest)'은(는) static 컨텍스트에서 참조할 수 없습니다
    }

    @PutMapping("/comment/{id}")
    public CommentResponseDto updateComment(@PathVariable Long id, @RequestBody CommentRequestDto requestDto, HttpServletRequest request) {
        return CommentService.updateComment(id, requestDto, request);

    }

    @DeleteMapping("/comment/{id}")   //
    public ResponseMsgDto deletePost(@PathVariable Long id, HttpServletRequest request) {
        CommentService.deletePost(id, request);
        return new ResponseMsgDto("댓글 삭제 완료", HttpStatus.OK.value());
    }
}
