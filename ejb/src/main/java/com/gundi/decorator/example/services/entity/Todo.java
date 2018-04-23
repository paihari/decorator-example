package com.gundi.decorator.example.services.entity;

/**
 * Created by pai on 16.02.18.
 */

import com.gundi.common.entity.impl.AuditableEntityBase;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@NamedQueries(
        {
                @NamedQuery(name="Todo.findAll", query = "select t from Todo t")
        }
)
public class Todo extends AuditableEntityBase implements Serializable{


    private Long id;

    private String summary;
    private String description;
    private ToDoType toDoType;

    public Todo(String  summary, String description, ToDoType toDoType) {
        this.summary = summary;
        this.description = description;
        this.toDoType = toDoType;
    }

    public Todo() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ToDoType getToDoType() {
        return toDoType;
    }

    public void setToDoType(ToDoType toDoType) {
        this.toDoType = toDoType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) &&
                Objects.equals(summary, todo.summary) &&
                Objects.equals(description, todo.description) &&
                toDoType == todo.toDoType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, summary, description, toDoType);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", toDoType=" + toDoType +
                '}';
    }
}

