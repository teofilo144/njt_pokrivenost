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
public class FondCasovaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "predmet_id")
    private long predmetId;
    
    @Basic(optional = false)
    @Column(name = "oblik_nastave_id")
    private long oblikNastaveId;

    public FondCasovaPK() {
    }

    public FondCasovaPK(long predmetId, long oblikNastaveId) {
        this.predmetId = predmetId;
        this.oblikNastaveId = oblikNastaveId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) predmetId;
        hash += (int) oblikNastaveId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FondCasovaPK)) {
            return false;
        }
        FondCasovaPK other = (FondCasovaPK) object;
        if (this.predmetId != other.predmetId) {
            return false;
        }
        if (this.oblikNastaveId != other.oblikNastaveId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.FondCasovaPK[ predmetId=" + predmetId + ", oblikNastaveId=" + oblikNastaveId + " ]";
    }
    
}
