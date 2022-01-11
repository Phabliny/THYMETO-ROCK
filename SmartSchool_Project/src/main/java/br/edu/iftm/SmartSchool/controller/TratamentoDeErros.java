package br.edu.iftm.SmartSchool.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class TratamentoDeErros {
    // @ExceptionHandler(BuscaPorCodSalaException.class)
    // String erroDAO(BuscaPorCodSalaException ex, Model modelo) {
    //     modelo.addAttribute("error", ex.getMessage());
    //     System.out.println("------------------------>>"+ex.getMessage());
    //     System.out.println("------------------------>>"+modelo.getAttribute("Sala"));
    //     return "/mantersala";
    // }
}
