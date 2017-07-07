package com.example.CRUDDemo.controller;

import com.example.CRUDDemo.domain.Fruit;
import com.example.CRUDDemo.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by aman on 6/14/17.
 */
@RestController
public class FruitController {
    @Autowired
    FruitService fruitService;

    @GetMapping("/fruit/")
    public ResponseEntity<?> display() {
        List<Fruit> fruitList = fruitService.findAll();
        return new ResponseEntity<>(fruitList, HttpStatus.OK);
    }

    @PostMapping("/fruit/")
    public ResponseEntity<?> insert(@RequestBody Fruit fruit) {
        fruitService.insert(fruit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/fruit/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Fruit fruit) {
        fruitService.update(id, fruit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/fruit/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        fruitService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/fruit/{name}")
    public ResponseEntity<?> displayByName(@PathVariable String name) {
        Fruit fruit = fruitService.findByname(name);
        return new ResponseEntity<>(fruit, HttpStatus.OK);
    }
}
