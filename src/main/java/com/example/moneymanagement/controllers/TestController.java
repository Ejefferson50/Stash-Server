package com.example.moneymanagement.controllers;

import com.example.moneymanagement.entities.TestEntity;
import com.example.moneymanagement.services.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/test")
public class TestController {

    private TestService testService;

    @GetMapping("/")
    public List<TestEntity> getTestEntities() {

        return testService.findAll();
    }
}