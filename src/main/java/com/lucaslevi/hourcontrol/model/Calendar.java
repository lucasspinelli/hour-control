package com.lucaslevi.hourcontrol.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {
    private Long id;
    private DateTipe dateTipe;
    private String description;
    private Date date;

}
