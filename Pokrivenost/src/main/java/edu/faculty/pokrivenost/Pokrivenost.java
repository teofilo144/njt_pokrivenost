/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.faculty.pokrivenost;

import edu.faculty.pokrivenost.dto.*;
import edu.faculty.pokrivenost.service.impl.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Igor
 */
@SpringBootApplication
public class Pokrivenost {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Pokrivenost.class, args);

        KatedraService katedraService = context.getBean(KatedraService.class);
        KatedraDTO katedraDto = new KatedraDTO(null, "Katedra za matematiku");
        KatedraDTO sacuvanaKatedra = katedraService.create(katedraDto);

        try {
            System.out.println("\nCREATE-----------------------------------------------------------");
            PredmetService predmetService = context.getBean(PredmetService.class);
            PredmetDTO predmetDto1 = new PredmetDTO(null, "Matematika 1", 5L, sacuvanaKatedra.getId());
            PredmetDTO sacuvanPredmet1 = predmetService.create(predmetDto1);
            PredmetDTO predmetDto2 = new PredmetDTO(null, "Matematika 2", 5L, sacuvanaKatedra.getId());
            PredmetDTO sacuvanPredmet2 = predmetService.create(predmetDto2);

            System.out.println("\nREAD-------------------------------------------------------------");
            List<PredmetDTO> predmetiUBazi = predmetService.findAll();
            System.out.println("\nU BAZI SE TRENUTNO NALAZE PREDMETI:");
            for (PredmetDTO p : predmetiUBazi) {
                System.out.println(p.getNaziv());
            }

            System.out.println("\nUPDATE-----------------------------------------------------------");
            // Prosledjen ID postojeceg record-a u bazi -> update
            PredmetDTO predmetDto2Update = new PredmetDTO(sacuvanPredmet2.getId(), "Numericka analiza", 4L, sacuvanaKatedra.getId());
            PredmetDTO sacuvanPredmet2Update = predmetService.create(predmetDto2Update);

            predmetiUBazi = predmetService.findAll();
            System.out.println("\nU BAZI SE TRENUTNO NALAZE PREDMETI:");
            for (PredmetDTO p : predmetiUBazi) {
                System.out.println(p.getNaziv());
            }

            System.out.println("\nDELETE-----------------------------------------------------------");
            predmetService.deleteById(predmetiUBazi.get(0).getId());
            
            predmetiUBazi = predmetService.findAll();
            System.out.println("\nU BAZI SE TRENUTNO NALAZE PREDMETI:");
            for (PredmetDTO p : predmetiUBazi) {
                System.out.println(p.getNaziv());
            }

        } catch (Exception ex) {
            Logger.getLogger(Pokrivenost.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
