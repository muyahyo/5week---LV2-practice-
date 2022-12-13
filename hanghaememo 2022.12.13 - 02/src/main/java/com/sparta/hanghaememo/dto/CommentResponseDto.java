package com.sparta.hanghaememo.dto;

import com.sparta.hanghaememo.entity.Comment;

import com.sparta.hanghaememo.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class CommentResponseDto {

    private Long id;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @ManyToOne
    @JoinColumn
    private String username;




    public CommentResponseDto(Comment comment) {
        this.id = Comment.getId();
        this.content = Comment.getContent();
        this.createdAt = Comment.getCreatedAt();
        this.modifiedAt = Comment.getModifiedAt();
        this.username = Comment.getUsername();
    }

}
