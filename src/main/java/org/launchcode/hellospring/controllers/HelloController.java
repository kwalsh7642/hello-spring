package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // Handles requests at path /hello1
    @GetMapping("hello1")

    public String hello() {
        return "Hello, Spring!";
    }

    // lives at /hello/goodbye
    @GetMapping("goodbye")

    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Dynamic handler handles requests of the for /hello?name=LaunchCode
    //lives at /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})

    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    //handler that handles requests of the form /hello/LaunchCode (path parameter)

    @GetMapping("{name}")

    public String helloWithPathParameter(@PathVariable String name){
        return "Hello, " + name + "!";

    }

    //display form
    //@GetMapping("form")

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
    //lives at hello/form
    @GetMapping("form")

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
