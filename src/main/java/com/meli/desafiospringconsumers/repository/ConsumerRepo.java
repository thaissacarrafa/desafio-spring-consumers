package com.meli.desafiospringconsumers.repository;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.meli.desafiospringconsumers.model.Consumer;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ConsumerRepo {

    private final String linkFile = "src/main/resources/consumers.json";
    ObjectMapper mapper = new ObjectMapper();

    public List<Consumer> getAll() {
        List<Consumer> consumers = null;

        try {
            consumers = Arrays.asList(mapper.readValue(new File(linkFile), Consumer[].class));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return consumers;
    }

    public void saveConsumer(Consumer newConsumer) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        List<Consumer> consumers = getAll();

        consumers = new ArrayList<>(consumers);

        consumers.add(newConsumer);

        try {
            writer.writeValue(new File(linkFile), consumers);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


