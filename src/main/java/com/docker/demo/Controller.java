package com.docker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private UsersRepo usersRepo;

    @GetMapping("/")
    public String welcome(){
        return "Hello";
    }

    @GetMapping("/add-user")
    public String addUser(){
        UsersModel userModel=new UsersModel();
        userModel.setName("Rajib");
        this.usersRepo.save(userModel);
        return "Successfully Added User";
    }
}
