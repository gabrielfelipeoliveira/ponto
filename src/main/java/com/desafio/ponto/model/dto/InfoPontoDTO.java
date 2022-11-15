package com.desafio.ponto.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InfoPontoDTO {

    private Long id;
    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataInclusao;
    private Long codigoFuncionario;
    private Long codigoEmpresa;
}
