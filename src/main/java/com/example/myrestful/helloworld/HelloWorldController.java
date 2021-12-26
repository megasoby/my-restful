package com.example.myrestful.helloworld;

import com.example.myrestful.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // "/hello-world" (endpoint)
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world") : 구방식
    @GetMapping(path = "/hello-world")
    public String HelloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
        return new HelloWorldBean("Hello World Bean!!");
    }

    // path-variable
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World Bean, %s", name));
    }
}
