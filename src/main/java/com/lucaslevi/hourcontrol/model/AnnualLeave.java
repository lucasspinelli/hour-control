package com.lucaslevi.hourcontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class AnnualLeave {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class AnnualLeaveId implements Serializable{
        private Long annualId;
        private Long movementId;
        private Long userId;
    }

    @EmbeddedId
    private AnnualLeaveId id;
    private Date workDate;
    private BigDecimal hourAmount;
    private BigDecimal hourBalance;
}
