package com.meli.desafiospringconsumers.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    private String cep;
    private String road;
    private String complement;
    private String district;
    private String state;
    private String uf;
}
