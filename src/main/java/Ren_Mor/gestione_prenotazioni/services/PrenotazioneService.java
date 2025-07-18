package Ren_Mor.gestione_prenotazioni.services;

import Ren_Mor.gestione_prenotazioni.entities.Postazione;
import Ren_Mor.gestione_prenotazioni.entities.Prenotazione;
import Ren_Mor.gestione_prenotazioni.entities.Utente;
import Ren_Mor.gestione_prenotazioni.repositories.PrenotazioneRepository;
import Ren_Mor.gestione_prenotazioni.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired private UtenteRepository utenteRepository;

    public static void saveAll(List<Postazione> p1) {
    }

    public Prenotazione prenotazione(Prenotazione prenotazione) {
        // Qui sto controllando se l'utente ha già una prenotazione per quella data
        if (prenotazioneRepository.existsByUtenteAndDataPrenotazione(prenotazione.getUtente(), prenotazione.getDataPrenotazione())) {
            throw new IllegalStateException("L'Utente ha già una prenotazione per questa data");
        }

        // Qui sto controllando se la postazione è già prenotata per quella data
        if (prenotazioneRepository.existsByPostazioneAndDataPrenotazione(prenotazione.getPostazione(), prenotazione.getDataPrenotazione())) {
            throw new IllegalStateException("La Postazione è già prenotata per questa data");
        }

        return prenotazioneRepository.save(prenotazione);
    }

    public void prenotazione(Utente u, Postazione p, LocalDate data) {
    }
}