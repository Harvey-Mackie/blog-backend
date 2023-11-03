package com.personal.blog.controllers;

import com.personal.blog.models.BlogSummary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class BlogController {

    @GetMapping("/")
    public Collection<BlogSummary> index(){
        return List.of(
                new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out"),
                new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out"),
                new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out"),
                new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out"),
                new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out"),
                new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out"),
                new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out"),
                new BlogSummary("How to become a Java Engineer in 2023", "Java", "This is just a sample article that I'm testing out.This is just a sample article that I'm testing out. This is just a sample article that I'm testing out. This is just a sample article that I'm testing out")
        );
    }
}

