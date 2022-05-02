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
        return new HelloWorldBean("Hello World"); // bean returned from this function is automatically converted to JSON
    }

    //hello-world/path-variable/in-28-minutes
    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s", name)); // bean returned from this function is automatically converted to JSON
    }
}
