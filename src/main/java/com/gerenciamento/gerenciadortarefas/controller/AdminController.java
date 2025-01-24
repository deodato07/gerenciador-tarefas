package com.gerenciamento.gerenciadortarefas.controller;

import org.springframework.stereotype.Controller;

@Controller
public class AdminController {
    public String adminHome() {
        return "admin";
    }
}
