package com.meli.desafiospringconsumers.model;

import lombok.Data;

@Data
public class Consumer {
    private int consumerId;
    private String name;
    private int level;
    private Integer cpf;
    private Address address;
}
