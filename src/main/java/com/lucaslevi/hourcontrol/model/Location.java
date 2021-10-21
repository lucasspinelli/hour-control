package com.lucaslevi.hourcontrol.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Location {
    private Long id;
    @OneToMany
    private AcessLevel acessLevel;
    private String description;
}
