/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.dto;

/**
 *
 * @author Igor
 */
public class PredmetDTO {

    private Long id;

    private String naziv;

    private Long espb;

    private Long katedraId;

    public PredmetDTO() {
    }

    public PredmetDTO(Long id, String naziv, Long espb, Long katedraId) {
        this.id = id;
        this.naziv = naziv;
        this.espb = espb;
        this.katedraId = katedraId;
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

    public Long getEspb() {
        return espb;
    }

    public void setEspb(Long espb) {
        this.espb = espb;
    }

    public Long getKatedraId() {
        return katedraId;
    }

    public void setKatedraId(Long katedraId) {
        this.katedraId = katedraId;
    }

}
