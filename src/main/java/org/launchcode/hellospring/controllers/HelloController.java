package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // Handles requests at path /hello
    @GetMapping("hello1")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Dynamic handler handles requests of the for /hello?name=LaunchCode

    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    //handler that handles requests of the form /hello/LaunchCode (path parameter)

    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParameter(@PathVariable String name){
        return "Hello, " + name + "!";

    }

}
