package Ren_Mor.gestione_prenotazioni.runner;

import Ren_Mor.gestione_prenotazioni.TipoPostazione;
import Ren_Mor.gestione_prenotazioni.entities.Edificio;
import Ren_Mor.gestione_prenotazioni.entities.Postazione;
import Ren_Mor.gestione_prenotazioni.entities.Utente;
import Ren_Mor.gestione_prenotazioni.repositories.EdificioRepository;
import Ren_Mor.gestione_prenotazioni.repositories.PrenotazioneRepository;
import Ren_Mor.gestione_prenotazioni.services.PostazioneService;
import Ren_Mor.gestione_prenotazioni.services.PrenotazioneService;
import Ren_Mor.gestione_prenotazioni.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {

    @Autowired
    private EdificioRepository edificioRepository;
    @Autowired
    private PostazioneService servicePostazione;
    @Autowired
    private UtenteService serviceUtente;
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    @Autowired
    private PrenotazioneService servicePrenotazione;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Caricamento dei dati");

        Edificio edificio = new Edificio("Edificio Gioviale", "Via del Giovine 71", "Cesena");
        edificio = edificioRepository.save(edificio);

        Postazione p1 = new Postazione("POST001", "OpenSpace 12", TipoPostazione.OPENSPACE, 8 ,edificio);
        Postazione p2 = new Postazione("POST002", "Sala VIP", TipoPostazione.PRIVATO,3,edificio);
        PrenotazioneService.saveAll(List.of(p1,p2));

        Utente u1 = new Utente("Giova101","Giovanni Storti","Giovanni.storti2007@gmail.com");
        Utente u2 = new Utente("Aldo102","Aldo Baglio","Aldo.Baglio1980@gmail.com");
        UtenteService.saveAll(List.of(u1, u2));

        LocalDate oggi = LocalDate.now();
        LocalDate domani = oggi.plusDays(1);


    }
    private void eseguiPrenotazione(PrenotazioneService service, Utente u, Postazione p, LocalDate data) {
        try {
            service.prenotazione(u, p, data);
            System.out.println("Prenotazione eseguita: " + u.getUsername() + " → " + " per il giorno " + data);
        } catch (Exception e) {
            System.out.println("Prenotazione fallita per " + u.getUsername() + ": " + e.getMessage());
        }
    }

}
