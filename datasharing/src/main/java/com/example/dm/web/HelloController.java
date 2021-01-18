package com.example.dm.web;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController  {
    //  String loancondition = "
    // ";

    protected transient Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping
    public String hello() {
        return "hello world wit test";
    }



}
