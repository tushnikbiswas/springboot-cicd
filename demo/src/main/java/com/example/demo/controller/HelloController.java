package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloController {

        @GetMapping("/api-hello")
        public String hello(){
            return "Jenkins and Docker CI/CD pipeline";
        }
}
