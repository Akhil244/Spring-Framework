package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // controller is defined as a Gateway which helps us in writting our endpoints
    // writting the method isnt really enough we have to make it excecutable endpoint in tomcat server
    // in order to turn the method into an Api where if the user hits the endpoint /hello we redirect to hello world
    /*
    we need to use certain annotations which can map the relevant method to the endpoint which can be done using

    @GetMapping("name_of_the_endpoint")

    which maps the method to the endpoint using GET Request since we are fetching the content from the server method
     */

    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }

}
