package com.sparta.hanghaememo.dto;


import com.sparta.hanghaememo.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class PostResponseDto {
    private Long id;
    private String username;
    private String content;
    private String title;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    private List<PostResponseDto> postResponseDto = new ArrayList<>();


    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.username = post.getUsername();
        this.content = post.getContent();
        this.title = post.getTitle();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
        }


}