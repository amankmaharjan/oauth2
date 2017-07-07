package com.example.CRUDDemo.repository;

import com.example.CRUDDemo.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aman on 6/14/17.
 */
@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
    public Fruit findByName(String name);
}
