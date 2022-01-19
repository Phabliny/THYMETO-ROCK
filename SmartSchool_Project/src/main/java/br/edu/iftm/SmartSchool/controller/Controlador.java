package br.edu.iftm.SmartSchool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

    @GetMapping(value = { "/", "/index" })
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @RequestMapping("/pagaluno")
    String pagaluno() {
        return "pagaluno";
    }

    @RequestMapping("/ajustealuno")
    String ajuste() {
        return "ajuste";
    }
  
}
