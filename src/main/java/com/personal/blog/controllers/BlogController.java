package com.personal.blog.controllers;

import com.personal.blog.models.BlogSummary;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@CrossOrigin
@RestController
public class BlogController {

    private final BlogSummary sampleBlogSummary = new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out");

    @GetMapping("/")
    public Collection<BlogSummary> index(){
        return List.of(sampleBlogSummary, sampleBlogSummary, sampleBlogSummary, sampleBlogSummary,sampleBlogSummary,sampleBlogSummary,sampleBlogSummary,sampleBlogSummary);
    }

    @GetMapping("/{blogId}")
    public BlogSummary index(String blogId){
        return sampleBlogSummary;
    }
}

