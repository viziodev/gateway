package com.wane.gateway.data.model;



import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "agents")
public class Agent {
    private Long id;
    private String name;
}

