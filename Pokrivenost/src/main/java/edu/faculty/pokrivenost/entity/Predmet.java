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
@Table(name = "predmet")
@NamedQueries({
    @NamedQuery(name = "Predmet.findAll", query = "SELECT p FROM Predmet p")})
public class Predmet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Basic(optional = false)
    @Column(name = "naziv")
    private String naziv;
    
    @Basic(optional = false)
    @Column(name = "espb")
    private long espb;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "predmet")
    private List<FondCasova> fondCasovaList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "predmet")
    private List<Predaje> predajeList;
    
    @JoinColumn(name = "katedra_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Katedra katedraId;

    public Predmet() {
    }

    public Predmet(Long id) {
        this.id = id;
    }

    public Predmet(Long id, String naziv, long espb) {
        this.id = id;
        this.naziv = naziv;
        this.espb = espb;
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

    public long getEspb() {
        return espb;
    }

    public void setEspb(long espb) {
        this.espb = espb;
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

    public Katedra getKatedraId() {
        return katedraId;
    }

    public void setKatedraId(Katedra katedraId) {
        this.katedraId = katedraId;
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
        if (!(object instanceof Predmet)) {
            return false;
        }
        Predmet other = (Predmet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.Predmet[ id=" + id + " ]";
    }
    
}
