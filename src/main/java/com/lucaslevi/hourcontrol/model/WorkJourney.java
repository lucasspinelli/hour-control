package com.lucaslevi.hourcontrol.model;

import lombok.*;

//Lombok helps to not write repetitive code like getters, setters and constructors
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class WorkJourney {
    private long id;
    private String description;
}
