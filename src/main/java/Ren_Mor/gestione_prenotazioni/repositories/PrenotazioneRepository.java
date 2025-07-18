package Ren_Mor.gestione_prenotazioni.repositories;

import Ren_Mor.gestione_prenotazioni.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
}
