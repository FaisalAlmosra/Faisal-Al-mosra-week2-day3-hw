package com.example.week2day3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @RequestMapping(path = "/hey", method = RequestMethod.GET)
    public String getHey() {
        return "Hey from spring";
    }

    @RequestMapping(path = "/bye", method = RequestMethod.GET)
    public String getBye() {
        return "Bye";
    }

    @RequestMapping(path = "/check", method = RequestMethod.GET)
    public String getCheck() {
        return "Everything OK";
    }

    @RequestMapping(path = "/health", method = RequestMethod.GET)
    public String gethealth() {
        return "Server health is up and running";
    }
}
