package Ren_Mor.gestione_prenotazioni.repositories;

import Ren_Mor.gestione_prenotazioni.TipoPostazione;
import Ren_Mor.gestione_prenotazioni.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoPostazioneAndEdificio_Citta(TipoPostazione tipoPostazione, String citta);
}
