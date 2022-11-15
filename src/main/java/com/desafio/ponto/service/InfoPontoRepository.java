package com.desafio.ponto.service;

import com.desafio.ponto.model.entity.InfoPonto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InfoPontoRepository extends JpaRepository<InfoPonto, Long> {
}
