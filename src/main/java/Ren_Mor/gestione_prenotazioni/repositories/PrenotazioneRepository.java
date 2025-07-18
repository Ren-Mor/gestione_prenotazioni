package Ren_Mor.gestione_prenotazioni.repositories;

import Ren_Mor.gestione_prenotazioni.entities.Postazione;
import Ren_Mor.gestione_prenotazioni.entities.Prenotazione;
import Ren_Mor.gestione_prenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
    List<Prenotazione> findByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
}
