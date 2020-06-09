package com.blog.service;

import com.blog.pojo.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> listComment(Long blogId) ;

    int saveComment(Comment comment);
}
