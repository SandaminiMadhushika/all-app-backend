package com.example.allapp.repository;

import java.util.List;

import com.example.allapp.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAll();
}