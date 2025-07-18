package Ren_Mor.gestione_prenotazioni.repositories;

import Ren_Mor.gestione_prenotazioni.TipoPostazione;
import Ren_Mor.gestione_prenotazioni.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoPostazioneAndEdificioAndCittaEdificio(TipoPostazione tipoPostazione, String cittaEdificio);
}
