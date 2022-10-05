package com.meli.desafiospringconsumers.controller;

import com.meli.desafiospringconsumers.dto.ConsumerDTO;
import com.meli.desafiospringconsumers.model.Consumer;
import com.meli.desafiospringconsumers.service.IConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;


@Controller
@RequestMapping("/api/v1/consumer")
public class ConsumerController {

    @Autowired
    private IConsumer service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Consumer consumer) {
        service.save(consumer);
    }

    @GetMapping
    public ResponseEntity<List<ConsumerDTO>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
