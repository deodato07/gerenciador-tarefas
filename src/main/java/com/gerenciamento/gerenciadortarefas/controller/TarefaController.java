package com.gerenciamento.gerenciadortarefas.controller;

import org.springframework.stereotype.Controller;

import ch.qos.logback.core.model.Model;

@Controller
public class TarefaController {

    public String listarTarefas(Model model) {
        return "tarefas";
    }
}
