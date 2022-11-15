package com.desafio.ponto.model.entity;

import com.desafio.ponto.model.dto.InfoPontoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "info_ponto")
@NoArgsConstructor
@AllArgsConstructor
public class InfoPonto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_inclusao")
    private LocalDateTime dataInclusao;

    @Column(name = "codigo_funcionario")
    private Long codigoFuncionario;

    @Column(name = "codigo_empresa")
    private Long codigoEmpresa;

    public InfoPonto(InfoPontoDTO ponto){
        this.codigoEmpresa = ponto.getCodigoEmpresa();
        this.codigoFuncionario = ponto.getCodigoEmpresa();
        this.dataInclusao = ponto.getDataInclusao();
    }
}
