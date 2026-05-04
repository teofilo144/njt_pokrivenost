/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import java.util.Objects;

/**
 *
 * @author Igor
 */
@Entity
@Table(name = "predaje")
@IdClass(PredajePK.class)
@NamedQueries({
    @NamedQuery(name = "Predaje.findAll", query = "SELECT p FROM Predaje p")})
public class Predaje implements Serializable {
    
    // Hibernate ne moze ispravno da mapira Embeddable slozeni kljuc, problem mu predstavlja redosled propertija
    // S druge strane, IdClass ne zadaje takve probleme
    
    @Id
    @Column(name = "predmet_id")
    private long predmetId;

    @Id
    @Column(name = "oblik_nastave_id")
    private long oblikNastaveId;

    @Id
    @Column(name = "nastavno_osoblje_id")
    private long nastavnoOsobljeId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "predmet_id", insertable = false, updatable = false)
    private Predmet predmet;

    @ManyToOne(optional = false)
    @JoinColumn(name = "oblik_nastave_id", insertable = false, updatable = false)
    private OblikNastave oblikNastave;

    @ManyToOne(optional = false)
    @JoinColumn(name = "nastavno_osoblje_id", insertable = false, updatable = false)
    private NastavnoOsoblje nastavnoOsoblje;

    public Predaje() {
    }

    public Predaje(Predmet predmet, OblikNastave oblikNastave, NastavnoOsoblje nastavnoOsoblje) {
        this.predmet = predmet;
        this.oblikNastave = oblikNastave;
        this.nastavnoOsoblje = nastavnoOsoblje;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public OblikNastave getOblikNastave() {
        return oblikNastave;
    }

    public void setOblikNastave(OblikNastave oblikNastave) {
        this.oblikNastave = oblikNastave;
    }

    public NastavnoOsoblje getNastavnoOsoblje() {
        return nastavnoOsoblje;
    }

    public void setNastavnoOsoblje(NastavnoOsoblje nastavnoOsoblje) {
        this.nastavnoOsoblje = nastavnoOsoblje;
    }

    @Override
    public int hashCode() {
        return Objects.hash(predmet, oblikNastave, nastavnoOsoblje);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Predaje other)) {
            return false;
        }
        return predmet.equals(other.predmet)
                && oblikNastave.equals(other.oblikNastave)
                && nastavnoOsoblje.equals(other.nastavnoOsoblje);
    }

    @Override
    public String toString() {
        return "Predaje{"
                + "predmet=" + predmet
                + ", oblikNastave=" + oblikNastave
                + ", nastavnoOsoblje=" + nastavnoOsoblje
                + '}';
    }

}
