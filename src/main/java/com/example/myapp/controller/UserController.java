package com.example.myapp.controller;

import com.example.myapp.entity.User;
import com.example.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("{id}")
    public User findById(@PathVariable int id){
        return userService.findById(id);
    }
    @PostMapping
    public User save(@RequestBody User user){
        userService.saveOrUpdate(user);
        return user;
    }
    @PutMapping
    public User update(@RequestBody User user){
        userService.saveOrUpdate(user);
        return user;
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        userService.delete(id);
        return "User deleted";
    }
}
