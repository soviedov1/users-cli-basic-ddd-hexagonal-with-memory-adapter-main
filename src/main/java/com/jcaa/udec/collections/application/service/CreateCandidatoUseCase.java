package com.jcaa.udec.collections.application.service;

import com.jcaa.udec.collections.domain.core.model.Candidato;
import com.jcaa.udec.collections.domain.core.repository.CandidatoRepository;

public class CreateCandidatoUseCase {
    private final CandidatoRepository candidatoRepository;

    public CreateCandidatoUseCase(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }

    public void ejecutar(Candidato candidato) {
        candidatoRepository.save(candidato);
    }
}

