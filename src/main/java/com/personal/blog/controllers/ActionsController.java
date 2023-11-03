package com.personal.blog.controllers;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionsController {

    @PutMapping("/actions/subscribe")
    public void subscribe(){
        System.out.printf("SUBSCRIBE CALLED");
    }
}
