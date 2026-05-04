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
@Table(name = "nastavno_osoblje")
@NamedQueries({
    @NamedQuery(name = "NastavnoOsoblje.findAll", query = "SELECT n FROM NastavnoOsoblje n")})
public class NastavnoOsoblje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Basic(optional = false)
    @Column(name = "ime")
    private String ime;
    
    @Basic(optional = false)
    @Column(name = "prezime")
    private String prezime;
    
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    
    @Basic(optional = false)
    @Column(name = "zvanje")
    private String zvanje;
    
    @JoinColumn(name = "katedra_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Katedra katedraId;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nastavnoOsoblje")
    private List<Predaje> predajeList;

    public NastavnoOsoblje() {
    }

    public NastavnoOsoblje(Long id) {
        this.id = id;
    }

    public NastavnoOsoblje(Long id, String ime, String prezime, String email, String zvanje) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.zvanje = zvanje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    public Katedra getKatedraId() {
        return katedraId;
    }

    public void setKatedraId(Katedra katedraId) {
        this.katedraId = katedraId;
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
        if (!(object instanceof NastavnoOsoblje)) {
            return false;
        }
        NastavnoOsoblje other = (NastavnoOsoblje) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.faculty.pokrivenost.entity.NastavnoOsoblje[ id=" + id + " ]";
    }
    
}
