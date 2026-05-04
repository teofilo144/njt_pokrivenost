/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.dto;

import java.util.List;

/**
 *
 * @author Igor
 */
public class KatedraDTO {

    private Long id;

    private String nazivKatedre;

    private List<NastavnoOsobljeDTO> nastavnoOsobljeList;

    private List<PredmetDTO> predmetList;

    public KatedraDTO() {
    }

    public KatedraDTO(Long id, String nazivKatedre) {
        this.id = id;
        this.nazivKatedre = nazivKatedre;
    }

    public KatedraDTO(Long id, String nazivKatedre, List<NastavnoOsobljeDTO> nastavnoOsobljeList, List<PredmetDTO> predmetList) {
        this.id = id;
        this.nazivKatedre = nazivKatedre;
        this.nastavnoOsobljeList = nastavnoOsobljeList;
        this.predmetList = predmetList;
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

    public List<NastavnoOsobljeDTO> getNastavnoOsobljeList() {
        return nastavnoOsobljeList;
    }

    public void setNastavnoOsobljeList(List<NastavnoOsobljeDTO> nastavnoOsobljeList) {
        this.nastavnoOsobljeList = nastavnoOsobljeList;
    }

    public List<PredmetDTO> getPredmetList() {
        return predmetList;
    }

    public void setPredmetList(List<PredmetDTO> predmetList) {
        this.predmetList = predmetList;
    }
    
}
