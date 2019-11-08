package com.tw.SpringSecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

    //its map to the root url
    @GetMapping("/")
    public String home() {
        return ("<h1>WELCOME WELCOME<h1>");
    }
}
