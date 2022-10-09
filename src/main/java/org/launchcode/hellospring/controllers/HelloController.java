package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
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

    //display form
    //@GetMapping("form")
    //@ResponseBody
    //public String helloForm(){
       // return "<html>" +
         //       "<body>" +
           //     "<form action='hello'>" + //submit a request to /hello
             //   "<input type='text' name='name'>" +
               // "<input type='submit' value='Greet me!'>" +
               // "</form>" +
               // "</body>" +
               // "</html>";
   // }

    //display form using post
    @GetMapping("form")
    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
