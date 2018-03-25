package com.twitter.model.dto;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
public class PostForm {
    @Email
    String email;
    @Size(max = 140)
    String post;
}
