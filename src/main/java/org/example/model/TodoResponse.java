package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TodoResponse {
    private  Long id;
    private String tile;
    private long order;
    private Boolean completed;
    private String url;

    public TodoResponse(TodoEntity todoEntity)
    {
        this.id = todoEntity.getId();
        this.tile = todoEntity.getTitle();
        this.order = todoEntity.getOrder();
        this.completed = todoEntity.getCompleted();
        this.url = "http://localhost:8080/" + this.id;
    }

}
