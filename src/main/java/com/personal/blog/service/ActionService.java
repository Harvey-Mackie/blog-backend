package com.personal.blog.service;

import com.personal.blog.models.domain.SubscriberEntity;
import com.personal.blog.repository.SubscriberRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ActionService {
    private final Logger logger = LoggerFactory.getLogger(ActionService.class);

    @Autowired
    private final SubscriberRepository subscriberRepository;

    public void subscribe(String name, String email){
        logger.info("Attempting to add " + email + " to the subscriber list.");

        var subscriber = new SubscriberEntity(name, email);

        if(subscriberRepository.findByEmail(email) != null){
            logger.info("Unable to save subscriber with email " + email + " as it has been used already.");
            return;
        }

        subscriberRepository.save(subscriber);



        logger.info("Successfully added " + email + " to the subscriber list.");
    }
}
