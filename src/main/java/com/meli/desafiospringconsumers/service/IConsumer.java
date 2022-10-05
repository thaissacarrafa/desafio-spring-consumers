package service;

import java.util.List;


public interface IConsumer {
    List<ConsumerDTO> getAll();

    void save(Consumer consumer);
}
