package com.example.erroer.service;

import com.example.erroer.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserDaoImpl userDao;
    public void addUser(){
        this.userDao.insert();
    }
}
