package com.in28minutes.rest.webservices.restfulwebservices;
import org.springframework.web.bind.annotation.*;

// Controller - that will handle http request
@RestController
public class HelloWorldController {
    // method -- "hello world"
    // uri ---
    //@RequestMapping(method=RequestMethod.GET,path="/hello-world")
    @GetMapping(path="/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
}
