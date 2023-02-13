package com.example.myapp.service;

import com.example.myapp.entity.User;
import com.example.myapp.respository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public void saveOrUpdate(User user) {
        userDAO.saveOrUpdate(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Transactional
    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Transactional
    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
