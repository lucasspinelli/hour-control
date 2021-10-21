package com.lucaslevi.hourcontrol.model;

import lombok.*;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.ManyToOne;
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

    @ManyToOne
    private UserCategory userCategory;

    private String name;

    @ManyToOne
    private Company company;

    @ManyToOne
    private AcessLevel acessLevel;

    @ManyToOne
    private WorkJourney workJourney;

    private BigDecimal tolerance; //to work with bigger decimals
    private LocalDateTime journeyStart;
    private LocalDateTime journeyEnd;
}
