package com.lucaslevi.hourcontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.lucaslevi.hourcontrol.model.TypeDate;


import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendar {
    @Id
    private Long id;
    @ManyToOne
    private TypeDate dateType;
    private String description;
    private Date date;

}
