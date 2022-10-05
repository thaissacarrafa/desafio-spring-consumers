package com.meli.desafiospringconsumers.dto;

import com.meli.desafiospringconsumers.model.Address;
import com.meli.desafiospringconsumers.model.Consumer;
import lombok.*;

@Data
public class ConsumerDTO {
    private int consumerId;
    private String name;
    private Integer cpf;
    private Address address;
    private int level;

    public ConsumerDTO(int consumerId, String name, int level) {
        this.consumerId = consumerId;
        this.name = name;
        this.level = level;
    }
}
