package com.lucaslevi.hourcontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

//Lombok helps to not write repetitive code like getters, setters and constructors
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class WorkJourney {
    @Id
    private Long id;
    private String description;
}
