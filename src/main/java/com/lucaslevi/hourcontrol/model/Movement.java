package com.lucaslevi.hourcontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementID implements Serializable{
        private Long movId;
        private Long userId;
    }

    @EmbeddedId //compound id
    private MovementID id;
    private Date dateStart;
    private Date dateEnd;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar; 
}
