package com.example.CRUDDemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by aman on 6/14/17.
 */
@Entity
public class Fruit {
    @Id
    int id;
    String name;

    public Fruit() {
    }

    public Fruit(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
