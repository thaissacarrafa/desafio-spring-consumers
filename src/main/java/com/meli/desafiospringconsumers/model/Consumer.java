package model;

import lombok.Data;

@Data
public class Consumer {
    private int consumerId;
    private String name;
    private Integer cpf;
    private Address address;
    private int level;
}
