package com.desafio.ponto.controller;

import com.desafio.ponto.model.dto.InfoPontoDTO;
import com.desafio.ponto.service.InfoPontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoPontoController {

    @Autowired
    private InfoPontoService service;

    @PostMapping(value = "/ponto")
    public ResponseEntity<?> inserirFollowupColaborador(@RequestBody InfoPontoDTO ponto) {
        service.baterPonto(ponto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
