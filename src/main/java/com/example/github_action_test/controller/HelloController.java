package com.example.github_action_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, hehe";
    }
}

// git init
// git add .
// git commit -m "first commit"
// git branch -M main
// git remote
// add origin https:// github.com/johnkeru/gh-action.git
// git push -u origin main
