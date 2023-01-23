package com.jhooq.Jhooqk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eks")
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - Jhooq-k8s i Have updated the message";
    }

    @GetMapping("/test")
    public String test(){
        return "This is for testing !!";
    }
}
