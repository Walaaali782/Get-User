package com.example.demo.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<String>> getProducts() {
        return ResponseEntity.ok(List.of("Parfum", "Shampoo", "Cream"));
    }
}
