package Ren_Mor.gestione_prenotazioni.services;

import Ren_Mor.gestione_prenotazioni.entities.Postazione;
import Ren_Mor.gestione_prenotazioni.entities.Prenotazione;
import Ren_Mor.gestione_prenotazioni.entities.Utente;
import Ren_Mor.gestione_prenotazioni.repositories.PrenotazioneRepository;
import Ren_Mor.gestione_prenotazioni.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    @Autowired private UtenteRepository utenteRepository;
    public Prenotazione prenotazione(Utente utente, Postazione postazione, LocalDate data) {
        // Qui sto controllando se l'utente ha già una prenotazione per quella data
        if (!prenotazioneRepository.findByUtenteAndDataPrenotazione(utente, data).isEmpty()) {
            throw new IllegalStateException("L'Utente ha già una prenotazione per questa data");
        }

        // Qui sto controllando se la postazione è già prenotata per quella data
        if (!prenotazioneRepository.findByPostazioneAndDataPrenotazione(postazione, data).isEmpty()) {
            throw new IllegalStateException("La Postazione è già prenotata per questa data");
        }

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente);
        prenotazione.setPostazione(postazione);
        prenotazione.setDataPrenotazione(data);
        return prenotazioneRepository.save(prenotazione);
    }
}