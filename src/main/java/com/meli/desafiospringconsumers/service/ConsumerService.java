package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService implements IConsumer {
    @Autowired
    private ConsumerRepo repository;

    @Override
    public void save(Consumer consumer) {
        repository.saveConsumer(consumer);
    }

    @Override
    public List<ConsumerDTO> getAll() {
        return repository.getAll().stream().map(ConsumerDTO::new).collect(Collectors.toList());
    }
}
