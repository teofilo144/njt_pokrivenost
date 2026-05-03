/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Igor
 */
@Embeddable
public class PredajePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "predmet_id")
    private long predmetId;
    
    @Basic(optional = false)
    @Column(name = "oblik_nastave_id")
    private long oblikNastaveId;
    
    @Basic(optional = false)
    @Column(name = "nastavno_osoblje_id")
    private long nastavnoOsobljeId;

    public PredajePK() {
    }

    public PredajePK(long predmetId, long oblikNastaveId, long nastavnoOsobljeId) {
        this.predmetId = predmetId;
        this.oblikNastaveId = oblikNastaveId;
        this.nastavnoOsobljeId = nastavnoOsobljeId;
    }

    public long getPredmetId() {
        return predmetId;
    }

    public void setPredmetId(long predmetId) {
        this.predmetId = predmetId;
    }

    public long getOblikNastaveId() {
        return oblikNastaveId;
    }

    public void setOblikNastaveId(long oblikNastaveId) {
        this.oblikNastaveId = oblikNastaveId;
    }

    public long getNastavnoOsobljeId() {
        return nastavnoOsobljeId;
    }

    public void setNastavnoOsobljeId(long nastavnoOsobljeId) {
        this.nastavnoOsobljeId = nastavnoOsobljeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) predmetId;
        hash += (int) oblikNastaveId;
        hash += (int) nastavnoOsobljeId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PredajePK)) {
            return false;
        }
        PredajePK other = (PredajePK) object;
        if (this.predmetId != other.predmetId) {
            return false;
        }
        if (this.oblikNastaveId != other.oblikNastaveId) {
            return false;
        }
        if (this.nastavnoOsobljeId != other.nastavnoOsobljeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.PredajePK[ predmetId=" + predmetId + ", oblikNastaveId=" + oblikNastaveId + ", nastavnoOsobljeId=" + nastavnoOsobljeId + " ]";
    }
    
}
