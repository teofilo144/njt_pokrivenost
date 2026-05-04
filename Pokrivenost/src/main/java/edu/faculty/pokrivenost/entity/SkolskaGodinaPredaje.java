/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.entity;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 *
 * @author Igor
 */
@Entity
@Table(name = "skolska_godina_predaje")
@NamedQueries({
    @NamedQuery(name = "SkolskaGodinaPredaje.findAll", query = "SELECT s FROM SkolskaGodinaPredaje s")})
public class SkolskaGodinaPredaje implements Serializable {

    @EmbeddedId
    protected SkolskaGodinaPredajePK skolskaGodinaPredajePK;
    
    @JoinColumn(name = "skolska_godina_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SkolskaGodina skolskaGodina;
    
    @JoinColumn(name = "predaje_predmet_id", referencedColumnName = "predmet_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Predaje predaje;
    
    @JoinColumn(name = "predaje_oblik_nastave_id", referencedColumnName = "oblik_nastave_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Predaje predaje1;
    
    @JoinColumn(name = "predaje_nastavno_osoblje_id", referencedColumnName = "nastavno_osoblje_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Predaje predaje2;

    public SkolskaGodinaPredaje() {
    }

    public SkolskaGodinaPredaje(SkolskaGodinaPredajePK skolskaGodinaPredajePK) {
        this.skolskaGodinaPredajePK = skolskaGodinaPredajePK;
    }

    public SkolskaGodinaPredaje(long skolskaGodinaId, long predajePredmetId, long predajeOblikNastaveId, long predajeNastavnoOsobljeId) {
        this.skolskaGodinaPredajePK = new SkolskaGodinaPredajePK(skolskaGodinaId, predajePredmetId, predajeOblikNastaveId, predajeNastavnoOsobljeId);
    }

    public SkolskaGodinaPredajePK getSkolskaGodinaPredajePK() {
        return skolskaGodinaPredajePK;
    }

    public void setSkolskaGodinaPredajePK(SkolskaGodinaPredajePK skolskaGodinaPredajePK) {
        this.skolskaGodinaPredajePK = skolskaGodinaPredajePK;
    }

    public SkolskaGodina getSkolskaGodina() {
        return skolskaGodina;
    }

    public void setSkolskaGodina(SkolskaGodina skolskaGodina) {
        this.skolskaGodina = skolskaGodina;
    }

    public Predaje getPredaje() {
        return predaje;
    }

    public void setPredaje(Predaje predaje) {
        this.predaje = predaje;
    }

    public Predaje getPredaje1() {
        return predaje1;
    }

    public void setPredaje1(Predaje predaje1) {
        this.predaje1 = predaje1;
    }

    public Predaje getPredaje2() {
        return predaje2;
    }

    public void setPredaje2(Predaje predaje2) {
        this.predaje2 = predaje2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (skolskaGodinaPredajePK != null ? skolskaGodinaPredajePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkolskaGodinaPredaje)) {
            return false;
        }
        SkolskaGodinaPredaje other = (SkolskaGodinaPredaje) object;
        if ((this.skolskaGodinaPredajePK == null && other.skolskaGodinaPredajePK != null) || (this.skolskaGodinaPredajePK != null && !this.skolskaGodinaPredajePK.equals(other.skolskaGodinaPredajePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.SkolskaGodinaPredaje[ skolskaGodinaPredajePK=" + skolskaGodinaPredajePK + " ]";
    }
    
}
