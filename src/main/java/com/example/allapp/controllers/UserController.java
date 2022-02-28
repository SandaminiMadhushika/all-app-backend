package com.example.allapp.controllers;

import java.util.List;

import com.example.allapp.models.User;
import com.example.allapp.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins="http://localhost:3000/")
@Controller
@RequestMapping(path="/all-app")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request
    return userService.adduser(name,email);

  }

  @GetMapping(path="/all")
  public @ResponseBody List<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userService.getAllUsers();
  }  
    
}
