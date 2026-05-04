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
@Table(name = "fond_casova")
@NamedQueries({
    @NamedQuery(name = "FondCasova.findAll", query = "SELECT f FROM FondCasova f")})
public class FondCasova implements Serializable {

    @EmbeddedId
    protected FondCasovaPK fondCasovaPK;
    
    @Basic(optional = false)
    @Column(name = "broj_casova")
    private long brojCasova;
    
    @JoinColumn(name = "predmet_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Predmet predmet;
    
    @JoinColumn(name = "oblik_nastave_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OblikNastave oblikNastave;

    public FondCasova() {
    }

    public FondCasova(FondCasovaPK fondCasovaPK) {
        this.fondCasovaPK = fondCasovaPK;
    }

    public FondCasova(FondCasovaPK fondCasovaPK, long brojCasova) {
        this.fondCasovaPK = fondCasovaPK;
        this.brojCasova = brojCasova;
    }

    public FondCasova(long predmetId, long oblikNastaveId) {
        this.fondCasovaPK = new FondCasovaPK(predmetId, oblikNastaveId);
    }

    public FondCasovaPK getFondCasovaPK() {
        return fondCasovaPK;
    }

    public void setFondCasovaPK(FondCasovaPK fondCasovaPK) {
        this.fondCasovaPK = fondCasovaPK;
    }

    public long getBrojCasova() {
        return brojCasova;
    }

    public void setBrojCasova(long brojCasova) {
        this.brojCasova = brojCasova;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fondCasovaPK != null ? fondCasovaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FondCasova)) {
            return false;
        }
        FondCasova other = (FondCasova) object;
        if ((this.fondCasovaPK == null && other.fondCasovaPK != null) || (this.fondCasovaPK != null && !this.fondCasovaPK.equals(other.fondCasovaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.FondCasova[ fondCasovaPK=" + fondCasovaPK + " ]";
    }
    
}
