package com.lucaslevi.hourcontrol.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Company {
    private Long id;
    private String description;
    private String cnpj;
    private String adress;
    private String city;
    private String state;
    private String district;
    private String phone;

}
