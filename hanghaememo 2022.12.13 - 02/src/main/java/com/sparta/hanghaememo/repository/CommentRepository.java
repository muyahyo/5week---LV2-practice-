package com.sparta.hanghaememo.repository;

import com.sparta.hanghaememo.entity.Comment;
import com.sparta.hanghaememo.entity.Post;
import com.sparta.hanghaememo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Optional<Object> findByIdAndUserId(Long id, Long userId);

    List<Comment> findAllByOrderByModifiedAtDesc();


}
