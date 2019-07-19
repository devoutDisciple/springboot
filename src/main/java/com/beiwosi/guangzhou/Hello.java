package com.beiwosi.guangzhou;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping(value="/hello")
    public String hello() {
        System.out.println("hello");
        return "hello world";
    }
}
