package Ren_Mor.gestione_prenotazioni.entities;

import jakarta.persistence.*;

@Entity
public class Postazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descrizionePostazione;
    @Enumerated(EnumType.STRING)
    private String tipoPostazione;
    private int occupantiMassimi;

    @ManyToOne Edificio edificio;
    public Postazione(){}


    // Getter
    public Long getId() {
        return id;
    }

    public String getDescrizionePostazione() {
        return descrizionePostazione;
    }

    public String getTipoPostazione() {
        return tipoPostazione;
    }

    public int getOccupantiMassimi() {
        return occupantiMassimi;
    }

    // Setter
    public void setDescrizionePostazione(String descrizionePostazione) {
        this.descrizionePostazione = descrizionePostazione;
    }

    public void setTipoPostazione(String tipoPostazione) {
        this.tipoPostazione = tipoPostazione;
    }

    public void setOccupantiMassimi(int occupantiMassimi) {
        this.occupantiMassimi = occupantiMassimi;
    }
}
