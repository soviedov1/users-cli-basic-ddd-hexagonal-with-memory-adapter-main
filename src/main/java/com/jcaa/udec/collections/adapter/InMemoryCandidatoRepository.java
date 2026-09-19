package com.jcaa.udec.collections.adapter;

import com.jcaa.udec.collections.domain.core.model.Candidato;
import com.jcaa.udec.collections.domain.core.repository.CandidatoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryCandidatoRepository implements CandidatoRepository {
    private final List<Candidato> candidatos = new ArrayList<>();

    @Override
    public void save(Candidato candidato) {
        candidatos.add(candidato);
    }

    @Override
    public Optional<Candidato> findById(String id) {
        return candidatos.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    @Override
    public void update(Candidato candidato) {
        delete(candidato.getId());
        candidatos.add(candidato);
    }

    @Override
    public void delete(String id) {
        candidatos.removeIf(c -> c.getId().equals(id));
    }

    @Override
    public List<Candidato> findAll() {
        return new ArrayList<>(candidatos);
    }
}

