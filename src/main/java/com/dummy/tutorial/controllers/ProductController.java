package com.dummy.tutorial.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
//@Controller("/products")
@RequestMapping("/products")
public class ProductController {

    @GetMapping()
    public List<Map<String,Object>> getAllProducts(){
        return Arrays.asList(
                Map.of("Mobile",1),
                Map.of("Furniture",23),
                Map.of("Laptop",1003)
        );
    }
    @GetMapping("/cat")
    public List<Map<String,Object>> getAll(){
        return Arrays.asList(
                Map.of("Mobile",1),
                Map.of("Furniture",23),
                Map.of("Laptop",1003)
        );
    }
}
