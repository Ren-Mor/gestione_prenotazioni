package Ren_Mor.gestione_prenotazioni.services;

import Ren_Mor.gestione_prenotazioni.entities.Postazione;
import Ren_Mor.gestione_prenotazioni.exceptions.ValidationException;
import Ren_Mor.gestione_prenotazioni.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostazioneService {

    @Autowired
    private PostazioneRepository postazioneRepository;

    public void savePostazione(Postazione postazione) {

        if (postazione.getTipoPostazione()== null) throw new ValidationException("Devi aggiungere il tipo di postazione");
    }
}
