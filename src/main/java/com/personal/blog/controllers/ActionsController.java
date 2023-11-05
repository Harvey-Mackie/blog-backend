package com.personal.blog.controllers;

import com.personal.blog.models.dto.SubscriberDto;
import com.personal.blog.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ActionsController {

    @Autowired
    private ActionService actionService;

    @PutMapping("/actions/subscribe")
    public void subscribe(
            @RequestBody SubscriberDto body
    ){
        actionService.subscribe(body.getName(), body.getEmail());
    }
}
