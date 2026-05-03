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
@Table(name = "katedra")
@NamedQueries({
    @NamedQuery(name = "Katedra.findAll", query = "SELECT k FROM Katedra k")})
public class Katedra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Basic(optional = false)
    @Column(name = "naziv_katedre")
    private String nazivKatedre;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "katedraId")
    private List<NastavnoOsoblje> nastavnoOsobljeList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "katedraId")
    private List<Predmet> predmetList;

    public Katedra() {
    }

    public Katedra(Long id) {
        this.id = id;
    }

    public Katedra(Long id, String nazivKatedre) {
        this.id = id;
        this.nazivKatedre = nazivKatedre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazivKatedre() {
        return nazivKatedre;
    }

    public void setNazivKatedre(String nazivKatedre) {
        this.nazivKatedre = nazivKatedre;
    }

    public List<NastavnoOsoblje> getNastavnoOsobljeList() {
        return nastavnoOsobljeList;
    }

    public void setNastavnoOsobljeList(List<NastavnoOsoblje> nastavnoOsobljeList) {
        this.nastavnoOsobljeList = nastavnoOsobljeList;
    }

    public List<Predmet> getPredmetList() {
        return predmetList;
    }

    public void setPredmetList(List<Predmet> predmetList) {
        this.predmetList = predmetList;
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
        if (!(object instanceof Katedra)) {
            return false;
        }
        Katedra other = (Katedra) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.Katedra[ id=" + id + " ]";
    }
    
}
