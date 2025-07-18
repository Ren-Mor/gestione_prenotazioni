package Ren_Mor.gestione_prenotazioni.repositories;

import Ren_Mor.gestione_prenotazioni.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
    boolean existsByNomeEdificio(String nomeEdificio);
    List<Edificio> findByNomeEdificio(String nomeEdificio);
}
