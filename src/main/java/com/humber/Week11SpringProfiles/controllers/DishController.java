package com.humber.Week11SpringProfiles.controllers;


import com.humber.Week11SpringProfiles.configs.DBConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DishController {

    private final DBConfig dbConfig;

    public DishController(DBConfig dbConfig) {
        this.dbConfig = dbConfig;
    }

    @GetMapping("/dish")
    public void runDB(){
        dbConfig.setupDBConnection();
    }
}
