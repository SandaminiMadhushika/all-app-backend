package com.example.allapp.services;

import java.util.List;

import com.example.allapp.models.User;
import com.example.allapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String adduser(String name,String email){
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
