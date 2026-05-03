/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Igor
 */
@Entity
@Table(name = "predaje")
@NamedQueries({
    @NamedQuery(name = "Predaje.findAll", query = "SELECT p FROM Predaje p")})
public class Predaje implements Serializable {

    @EmbeddedId
    protected PredajePK predajePK;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "predaje")
    private List<SkolskaGodinaPredaje> skolskaGodinaPredajeList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "predaje1")
    private List<SkolskaGodinaPredaje> skolskaGodinaPredajeList1;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "predaje2")
    private List<SkolskaGodinaPredaje> skolskaGodinaPredajeList2;
    
    @JoinColumn(name = "predmet_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Predmet predmet;
    
    @JoinColumn(name = "oblik_nastave_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OblikNastave oblikNastave;
    
    @JoinColumn(name = "nastavno_osoblje_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private NastavnoOsoblje nastavnoOsoblje;

    public Predaje() {
    }

    public Predaje(PredajePK predajePK) {
        this.predajePK = predajePK;
    }

    public Predaje(long predmetId, long oblikNastaveId, long nastavnoOsobljeId) {
        this.predajePK = new PredajePK(predmetId, oblikNastaveId, nastavnoOsobljeId);
    }

    public PredajePK getPredajePK() {
        return predajePK;
    }

    public void setPredajePK(PredajePK predajePK) {
        this.predajePK = predajePK;
    }

    public List<SkolskaGodinaPredaje> getSkolskaGodinaPredajeList() {
        return skolskaGodinaPredajeList;
    }

    public void setSkolskaGodinaPredajeList(List<SkolskaGodinaPredaje> skolskaGodinaPredajeList) {
        this.skolskaGodinaPredajeList = skolskaGodinaPredajeList;
    }

    public List<SkolskaGodinaPredaje> getSkolskaGodinaPredajeList1() {
        return skolskaGodinaPredajeList1;
    }

    public void setSkolskaGodinaPredajeList1(List<SkolskaGodinaPredaje> skolskaGodinaPredajeList1) {
        this.skolskaGodinaPredajeList1 = skolskaGodinaPredajeList1;
    }

    public List<SkolskaGodinaPredaje> getSkolskaGodinaPredajeList2() {
        return skolskaGodinaPredajeList2;
    }

    public void setSkolskaGodinaPredajeList2(List<SkolskaGodinaPredaje> skolskaGodinaPredajeList2) {
        this.skolskaGodinaPredajeList2 = skolskaGodinaPredajeList2;
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
        int hash = 0;
        hash += (predajePK != null ? predajePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Predaje)) {
            return false;
        }
        Predaje other = (Predaje) object;
        if ((this.predajePK == null && other.predajePK != null) || (this.predajePK != null && !this.predajePK.equals(other.predajePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.Predaje[ predajePK=" + predajePK + " ]";
    }
    
}
