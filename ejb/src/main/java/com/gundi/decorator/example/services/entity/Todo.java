package com.gundi.decorator.example.services.entity;

/**
 * Created by pai on 16.02.18.
 */

import com.gundi.common.entity.impl.AuditableEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Todo extends AuditableEntityBase implements Serializable{


    private Long id;

    private String summary;
    private String description;

    public Todo(String  summary, String description) {
        this.summary = summary;
        this.description = description;
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

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                '}' + super.toString();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id) &&
                Objects.equals(summary, todo.summary) &&
                Objects.equals(description, todo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, summary, description);
    }
}
