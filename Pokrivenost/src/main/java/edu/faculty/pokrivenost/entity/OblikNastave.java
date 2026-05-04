/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.entity;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

/**
 *
 * @author Igor
 */
@Entity
@Table(name = "oblik_nastave")
@NamedQueries({
    @NamedQuery(name = "OblikNastave.findAll", query = "SELECT o FROM OblikNastave o")})
public class OblikNastave implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Basic(optional = false)
    @Column(name = "naziv")
    private String naziv;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oblikNastave")
    private List<FondCasova> fondCasovaList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oblikNastave")
    private List<Predaje> predajeList;

    public OblikNastave() {
    }

    public OblikNastave(Long id) {
        this.id = id;
    }

    public OblikNastave(Long id, String naziv) {
        this.id = id;
        this.naziv = naziv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<FondCasova> getFondCasovaList() {
        return fondCasovaList;
    }

    public void setFondCasovaList(List<FondCasova> fondCasovaList) {
        this.fondCasovaList = fondCasovaList;
    }

    public List<Predaje> getPredajeList() {
        return predajeList;
    }

    public void setPredajeList(List<Predaje> predajeList) {
        this.predajeList = predajeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OblikNastave)) {
            return false;
        }
        OblikNastave other = (OblikNastave) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.OblikNastave[ id=" + id + " ]";
    }
    
}
