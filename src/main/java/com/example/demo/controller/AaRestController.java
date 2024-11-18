package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class AaRestController {

    @GetMapping(value = "/user")
    public ResponseEntity<?> user() {
        return ResponseEntity.ok("82265611");
    }

}
