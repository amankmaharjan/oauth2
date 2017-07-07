package com.example.CRUDDemo.services;

import com.example.CRUDDemo.domain.Fruit;
import com.example.CRUDDemo.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aman on 6/14/17.
 */
@Service
public class FruitService {
    @Autowired
    FruitRepository fruitRepository;

    public void insert(Fruit u) {
        fruitRepository.save(u);
    }

    public void update(Integer id, Fruit editeduser) {
        Fruit fruit = findOne(id);
        if (fruit != null) {
            fruit.setName(editeduser.getName());
            fruitRepository.save(fruit);
        }
    }

    public void delete(Integer id) {
        Fruit fruit = findOne(id);
        if (fruit != null) {
            fruitRepository.delete(fruit);
        }
    }

    public List<Fruit> findAll() {
        List<Fruit> fruitList = fruitRepository.findAll();
        return fruitList;
    }

    public Fruit findOne(Integer id) {
        Fruit fruit = fruitRepository.findOne(id);
        return fruit;
    }

    public Fruit findByname(String name) {
        Fruit fruit = fruitRepository.findByName(name);
        return fruit;
    }
}

