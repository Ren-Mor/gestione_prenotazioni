package Ren_Mor.gestione_prenotazioni.services;

import Ren_Mor.gestione_prenotazioni.entities.Utente;
import Ren_Mor.gestione_prenotazioni.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Ren_Mor.gestione_prenotazioni.exceptions.ValidationException;

import java.util.List;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public static void saveAll(List<Utente> u1) {
    }

    public void saveUtente(Utente newUtente){
        if (utenteRepository.existsByEmail(newUtente.getEmail())) throw new ValidationException("Email " + newUtente.getEmail() + " già in uso");
        if (utenteRepository.existsByUsername(newUtente.getUsername())) throw new ValidationException("Username già utilizzato");
        utenteRepository.save(newUtente);
        System.out.println("L'utente è stato creato");
    }
}
