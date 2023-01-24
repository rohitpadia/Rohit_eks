package com.jhooq.Jhooqk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eks")
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!! i Have updated the message";

    }

    @GetMapping("/test")
    public String test()
    {
        return "Yo!!! I am RoPadia The Legend!! of north wuth my henchman SAYON The GREAT!! Give us your lunch money";
    }


}
