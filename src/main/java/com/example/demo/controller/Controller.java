package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hamza")
public class Controller {


    @GetMapping("/all")
    public List findAll() {

        List list = new ArrayList();
        for(int i=0;i<5;i++){
            list.add(i);
        }
        return list;
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id) {
        return "hamza"+id;
    }

    @GetMapping
    public String addFoo(@RequestParam(name = "id") String fooId) {
        return "ID: " + fooId;
    }
}
