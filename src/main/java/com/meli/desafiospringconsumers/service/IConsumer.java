package com.meli.desafiospringconsumers.service;

import com.meli.desafiospringconsumers.dto.ConsumerDTO;
import com.meli.desafiospringconsumers.model.Consumer;

import java.util.List;


public interface IConsumer {
    List<ConsumerDTO> getAll();

    void save(Consumer consumer);
}
