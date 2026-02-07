package com.practive.learn.controller;


import com.practive.learn.model.Todo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TodoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Docker + Kubernetes project- v2";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }


}