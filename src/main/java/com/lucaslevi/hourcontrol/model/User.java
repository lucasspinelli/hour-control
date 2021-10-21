package com.lucaslevi.hourcontrol.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    private Long id;
    private UserCategory userCategory;
    private String name;
    private Company company;
    private AcessLevel acessLevel;
    private WorkJourney workJourney;
    private BigDecimal tolerance; //to work with bigger decimals
    private LocalDateTime journeyStart;
    private LocalDateTime journeyEnd;
}
