package com.sparta.hanghaememo.entity;

import com.sparta.hanghaememo.dto.CommentRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Comment extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String content;


    @Column(nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    public void update(CommentRequestDto requestDto){
    this.content = requestDto.getContent();
    }

    public void delete(CommentRequestDto requestDto) {
        this.content = requestDto.getContent();
    }

    public Comment(CommentRequestDto requestDto, Long userid, String username) {
        this.username = username;
        this.content = requestDto.getContent();
        this.userId = userid;
    }



}
