package com.gerenciamento.gerenciadortarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RotasController {
    @GetMapping("/adm")
    public String administracao(Model model) {
        return "gerenciadortarefas/gerenciador-tarefas";
    }

    @GetMapping("/tarefas")
    public String tarefas(Model model) {
        return "gerenciadortarefas/tarefas";
    }
}
