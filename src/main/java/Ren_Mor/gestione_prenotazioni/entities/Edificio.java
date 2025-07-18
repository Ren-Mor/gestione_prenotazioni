package Ren_Mor.gestione_prenotazioni.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Edificio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeEdificio;
    private String indirizzoEdificio;
    private String cittaEdificio;

    public Edificio(){}

    // Getter
    public Long getId() {
        return id;
    }

    public String getNomeEdificio() {
        return nomeEdificio;
    }

    public String getIndirizzoEdificio() {
        return indirizzoEdificio;
    }

    public String getCittaEdificio() {
        return cittaEdificio;
    }

    // Setter
    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    public void setIndirizzoEdificio(String indirizzoEdificio) {
        indirizzoEdificio = indirizzoEdificio;
    }

    public void setCittaEdificio(String cittaEdificio) {
        this.cittaEdificio = cittaEdificio;
    }
}
