package com.personal.blog.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BlogSummary {
    public String name;
    public String category;
    public String summary;
}
