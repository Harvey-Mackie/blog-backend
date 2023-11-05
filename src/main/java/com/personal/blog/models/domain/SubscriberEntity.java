package com.personal.blog.models.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class SubscriberEntity {

    public SubscriberEntity(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Id
    @SequenceGenerator(
            name = "subscriber_sequence",
            sequenceName = "subscriber_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "subscriber_sequence"
    )
    private Long id;

    @Column(unique=true)
    private String email;
    private String name;
}
