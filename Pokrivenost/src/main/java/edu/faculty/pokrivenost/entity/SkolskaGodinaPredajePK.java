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
@Embeddable
public class SkolskaGodinaPredajePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "skolska_godina_id")
    private long skolskaGodinaId;
    
    @Basic(optional = false)
    @Column(name = "predaje_predmet_id")
    private long predajePredmetId;
    
    @Basic(optional = false)
    @Column(name = "predaje_oblik_nastave_id")
    private long predajeOblikNastaveId;
    
    @Basic(optional = false)
    @Column(name = "predaje_nastavno_osoblje_id")
    private long predajeNastavnoOsobljeId;

    public SkolskaGodinaPredajePK() {
    }

    public SkolskaGodinaPredajePK(long skolskaGodinaId, long predajePredmetId, long predajeOblikNastaveId, long predajeNastavnoOsobljeId) {
        this.skolskaGodinaId = skolskaGodinaId;
        this.predajePredmetId = predajePredmetId;
        this.predajeOblikNastaveId = predajeOblikNastaveId;
        this.predajeNastavnoOsobljeId = predajeNastavnoOsobljeId;
    }

    public long getSkolskaGodinaId() {
        return skolskaGodinaId;
    }

    public void setSkolskaGodinaId(long skolskaGodinaId) {
        this.skolskaGodinaId = skolskaGodinaId;
    }

    public long getPredajePredmetId() {
        return predajePredmetId;
    }

    public void setPredajePredmetId(long predajePredmetId) {
        this.predajePredmetId = predajePredmetId;
    }

    public long getPredajeOblikNastaveId() {
        return predajeOblikNastaveId;
    }

    public void setPredajeOblikNastaveId(long predajeOblikNastaveId) {
        this.predajeOblikNastaveId = predajeOblikNastaveId;
    }

    public long getPredajeNastavnoOsobljeId() {
        return predajeNastavnoOsobljeId;
    }

    public void setPredajeNastavnoOsobljeId(long predajeNastavnoOsobljeId) {
        this.predajeNastavnoOsobljeId = predajeNastavnoOsobljeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) skolskaGodinaId;
        hash += (int) predajePredmetId;
        hash += (int) predajeOblikNastaveId;
        hash += (int) predajeNastavnoOsobljeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkolskaGodinaPredajePK)) {
            return false;
        }
        SkolskaGodinaPredajePK other = (SkolskaGodinaPredajePK) object;
        if (this.skolskaGodinaId != other.skolskaGodinaId) {
            return false;
        }
        if (this.predajePredmetId != other.predajePredmetId) {
            return false;
        }
        if (this.predajeOblikNastaveId != other.predajeOblikNastaveId) {
            return false;
        }
        if (this.predajeNastavnoOsobljeId != other.predajeNastavnoOsobljeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.SkolskaGodinaPredajePK[ skolskaGodinaId=" + skolskaGodinaId + ", predajePredmetId=" + predajePredmetId + ", predajeOblikNastaveId=" + predajeOblikNastaveId + ", predajeNastavnoOsobljeId=" + predajeNastavnoOsobljeId + " ]";
    }
    
}
