package br.edu.iftm.SmartSchool.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.SmartSchool.model.Usuario;
import br.edu.iftm.SmartSchool.security.MyUserDetails;

@Controller
public class Controlador {

    @RequestMapping(value = { "/", "/index" })
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @RequestMapping("/pagaluno")
    public String pagaluno(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Usuario usuario = ((MyUserDetails) principal).getUsuario();
        model.addAttribute("usuario", usuario);
        return "pagaluno";
    }

    @RequestMapping("/ajustealuno")
    String ajuste() {
        return "ajuste";
    }
  
}
