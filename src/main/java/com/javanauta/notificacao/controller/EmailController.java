package com.javanauta.notificacao.controller;

import com.javanauta.notificacao.business.dto.TarefasDTO;
import com.javanauta.notificacao.business.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<Void> enviaEmail(@RequestBody TarefasDTO tarefasdto){
        emailService.enviaEmail(tarefasdto);
        return ResponseEntity.ok().build();
    }
}
