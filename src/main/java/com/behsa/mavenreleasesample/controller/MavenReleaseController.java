package com.behsa.mavenreleasesample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MavenReleaseController {

    @GetMapping("/maven")
    public String hello() {
        return "Hello, Maven Release Plugin!!";
    }
}