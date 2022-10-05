package com.meli.desafiospringconsumers.dto;

import lombok.*;

@Data
public class ConsumerDTO {
    private int consumerId;
    private String name;
    private int level;

    public ConsumerDTO(int consumerId, String name, int level) {
        this.consumerId = consumerId;
        this.name = name;
        this.level = level;
    }
}
