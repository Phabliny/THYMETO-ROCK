package br.edu.iftm.SmartSchool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.iftm.SmartSchool.beans.UsuarioBean;

@Controller
public class Controlador {

    @Autowired
    UsuarioBean usuarioBean;

    @GetMapping(value = { "/", "/index" })
    public String refererPage() {
        if (usuarioBean.getURL() == null)
            return "index";
        String retorno = "redirect:" + usuarioBean.getURL();
        usuarioBean.setURL(null);
        return retorno;
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @RequestMapping("/aluno")
    String aluno() {
        return "pagaluno";
    }

    @RequestMapping("/ajustealuno")
    String ajuste() {
        return "ajuste";
    }
}
