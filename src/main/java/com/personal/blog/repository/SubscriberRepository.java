package com.personal.blog.repository;

import com.personal.blog.models.domain.SubscriberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<SubscriberEntity, Long> {
    public SubscriberEntity findByEmail(String email);
}
