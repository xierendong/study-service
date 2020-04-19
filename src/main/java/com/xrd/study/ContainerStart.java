package com.xrd.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainerStart {
    public static void main(String[] args) {
        new SpringApplication(ContainerStart.class).run(args);
    }
    @RequestMapping("/")
    public String helloWorld(){
        return "hello spring boot";
    }
}
