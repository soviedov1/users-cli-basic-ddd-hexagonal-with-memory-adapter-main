package com.jcaa.udec.collections.domain.core.repository;

import com.jcaa.udec.collections.domain.core.model.Candidato;
import java.util.List;
import java.util.Optional;

public interface CandidatoRepository {
    void save(Candidato candidato);
    Optional<Candidato> findById(String id);
    void update(Candidato candidato);
    void delete(String id);
    List<Candidato> findAll();
}

