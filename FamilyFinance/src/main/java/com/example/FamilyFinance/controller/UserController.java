package com.example.FamilyFinance.controller;

import com.example.FamilyFinance.entity.User;
import com.example.FamilyFinance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }

    public String login(@RequestBody User user){
        return userService.verify(user);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId,@RequestBody User user){
        return userService.updateUser(userId,user);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
    }
}