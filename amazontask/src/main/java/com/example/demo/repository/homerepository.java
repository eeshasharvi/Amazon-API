package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.home;

@Repository

public interface homerepository extends CrudRepository<home, Integer> {

}
