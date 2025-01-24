package com.gerenciamento.gerenciadortarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String index() {
        return "gerenciadortarefas/index";
    }

    @GetMapping("/login")
    public String login() {
        return "gerenciadortarefas/login";
    }

}
