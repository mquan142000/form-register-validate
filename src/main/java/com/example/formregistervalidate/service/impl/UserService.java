package com.example.formregistervalidate.service.impl;

import com.example.formregistervalidate.model.User;
import com.example.formregistervalidate.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public void save(User user) {
        System.out.println("User saved: " + user.getFirstName() + " " + user.getLastName());
    }
}
