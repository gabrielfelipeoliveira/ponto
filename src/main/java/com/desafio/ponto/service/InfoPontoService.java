package com.desafio.ponto.service;

import com.desafio.ponto.model.dto.InfoPontoDTO;
import com.desafio.ponto.model.entity.InfoPonto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class InfoPontoService {

    @Autowired
    private InfoPontoRepository repository;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void baterPonto(InfoPontoDTO pontoDTO) {
        InfoPonto ponto = new InfoPonto(pontoDTO);
        kafkaTemplate.send("topic-1", new Gson().toJson(pontoDTO));
        repository.save(ponto);
    }

}
