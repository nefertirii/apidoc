package com.example.apidoc.post.request;

import lombok.Data;

@Data
public class PostCreateRequest {
    private String title;
    private String content;
}
