/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.entity;

import java.io.Serializable;

/**
 *
 * @author Igor
 */
public class PredajePK implements Serializable {

    private long predmetId;
    private long oblikNastaveId;
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
        return java.util.Objects.hash(predmetId, oblikNastaveId, nastavnoOsobljeId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PredajePK that)) {
            return false;
        }
        return predmetId == that.predmetId
                && oblikNastaveId == that.oblikNastaveId
                && nastavnoOsobljeId == that.nastavnoOsobljeId;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.PredajePK[ predmetId=" + predmetId + ", oblikNastaveId=" + oblikNastaveId + ", nastavnoOsobljeId=" + nastavnoOsobljeId + " ]";
    }
}
