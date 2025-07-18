package Ren_Mor.gestione_prenotazioni.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne private Utente utente;
    @ManyToOne private Postazione postazione;
    private LocalDate dataPrenotazione;

    public Prenotazione(){}

    public Prenotazione(Utente utente, Postazione postazione, LocalDate dataPrenotazione) {
        this.utente = utente;
        this.postazione = postazione;
        this.dataPrenotazione = dataPrenotazione;
    }

    // Getter
    public Long getId() {
        return id;
    }

    public Utente getUtente() {
        return utente;
    }

    public Postazione getPostazione() {
        return postazione;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    // Setter
    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }
}
