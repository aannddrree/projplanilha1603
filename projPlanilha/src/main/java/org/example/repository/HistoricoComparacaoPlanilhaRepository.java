package org.example.repository;

import org.example.model.HistoricoComparacaoPlanilhas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoComparacaoPlanilhaRepository extends MongoRepository<HistoricoComparacaoPlanilhas, String> {
}
