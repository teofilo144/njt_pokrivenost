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
@Table(name = "skolska_godina")
@NamedQueries({
    @NamedQuery(name = "SkolskaGodina.findAll", query = "SELECT s FROM SkolskaGodina s")})
public class SkolskaGodina implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Basic(optional = false)
    @Column(name = "naziv")
    private String naziv;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skolskaGodina")
    private List<SkolskaGodinaPredaje> skolskaGodinaPredajeList;

    public SkolskaGodina() {
    }

    public SkolskaGodina(Long id) {
        this.id = id;
    }

    public SkolskaGodina(Long id, String naziv) {
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

    public List<SkolskaGodinaPredaje> getSkolskaGodinaPredajeList() {
        return skolskaGodinaPredajeList;
    }

    public void setSkolskaGodinaPredajeList(List<SkolskaGodinaPredaje> skolskaGodinaPredajeList) {
        this.skolskaGodinaPredajeList = skolskaGodinaPredajeList;
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
        if (!(object instanceof SkolskaGodina)) {
            return false;
        }
        SkolskaGodina other = (SkolskaGodina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.SkolskaGodina[ id=" + id + " ]";
    }
    
}
