package Ren_Mor.gestione_prenotazioni.repositories;

import Ren_Mor.gestione_prenotazioni.entities.Postazione;
import Ren_Mor.gestione_prenotazioni.entities.Prenotazione;
import Ren_Mor.gestione_prenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);
    boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
    List<Prenotazione> findByUtente(Utente utente);
}
