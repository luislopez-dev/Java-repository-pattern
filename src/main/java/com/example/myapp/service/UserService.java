package com.example.myapp.service;

import com.example.myapp.entity.User;

import java.util.List;

public interface UserService {
    public void saveOrUpdate(User user);
    public void delete(int id);
    public User findById(int id);
    public List<User> findAll();
}
