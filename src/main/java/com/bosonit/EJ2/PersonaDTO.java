package com.bosonit.EJ2;

import lombok.Data;

import java.util.Date;

@Data

public class PersonaDTO{

    private Integer id_persona;
    private String usuario;
    private Integer password;
    private String name;
    private String surname;
    private String company_email;
    private String persona_email;
    private String city;
    private Boolean active;
    private Date created_date;
    private String imagen_url;
    private Date termination_date;
}

