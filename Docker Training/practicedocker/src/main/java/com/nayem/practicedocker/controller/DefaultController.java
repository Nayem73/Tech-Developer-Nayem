package com.nayem.practicedocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @GetMapping("/api/string")
    public ResponseEntity<?> defaultMethod() {
        return ResponseEntity.ok("Returning a string from ResponseEntity");
    }
}
