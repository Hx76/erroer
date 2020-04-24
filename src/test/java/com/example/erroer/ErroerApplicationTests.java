package com.example.erroer;

import com.example.erroer.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ErroerApplicationTests {
    @Autowired
    private UserServiceImpl service;

    @Test
    void contextLoads() {
        this.service.addUser();
    }

}
