package Ren_Mor.gestione_prenotazioni.entities;

import Ren_Mor.gestione_prenotazioni.TipoPostazione;
import jakarta.persistence.*;

@Entity
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizionePostazione;
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;
    private int occupantiMassimi;

    @ManyToOne Edificio edificio;
    public Postazione(){}

    public Postazione(String descrizionePostazione, TipoPostazione tipoPostazione, int occupantiMassimi, Edificio edificio) {
        this.descrizionePostazione = descrizionePostazione;
        this.tipoPostazione = tipoPostazione;
        this.occupantiMassimi = occupantiMassimi;
        this.edificio = edificio;
    }

    // Getter
    public Long getId() {
        return id;
    }

    public String getDescrizionePostazione() {
        return descrizionePostazione;
    }

    public TipoPostazione getTipoPostazione() {
        return tipoPostazione;
    }

    public int getOccupantiMassimi() {
        return occupantiMassimi;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    // Setter
    public void setDescrizionePostazione(String descrizionePostazione) {
        this.descrizionePostazione = descrizionePostazione;
    }

    public void setTipoPostazione(TipoPostazione tipoPostazione) {
        this.tipoPostazione = tipoPostazione;
    }

    public void setOccupantiMassimi(int occupantiMassimi) {
        this.occupantiMassimi = occupantiMassimi;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
}
