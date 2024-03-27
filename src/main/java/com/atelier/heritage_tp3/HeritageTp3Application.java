package com.atelier.heritage_tp3;

import com.atelier.heritage_tp3.dao.entities.Etudiant;
import com.atelier.heritage_tp3.dao.entities.Personne;
import com.atelier.heritage_tp3.dao.entities.Professeur;
import com.atelier.heritage_tp3.dao.repositories.EtudiantRepository;
import com.atelier.heritage_tp3.dao.repositories.PersonneRepository;
import com.atelier.heritage_tp3.dao.repositories.ProfesseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HeritageTp3Application implements CommandLineRunner {
    @Autowired
    private PersonneRepository personneRepository;
    private EtudiantRepository etudiantRepository;
    private ProfesseurRepository professeurRepository;

    public static void main(String[] args) {
        SpringApplication.run(HeritageTp3Application.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("hachim");
        etudiant.setDateNaissance(new Date());
        etudiant.setMatricule("etudiant G11 4IIR");
        personneRepository.save(etudiant);

        Professeur professeur=new Professeur();
        professeur.setNom("Mr Badr");
        professeur.setDateNaissance(new Date());
        professeur.setD_affectation(new Date());

        personneRepository.save(professeur);

        Personne personne=new Personne();
        personne.setNom("youssef");
        personne.setDateNaissance(new Date());

        personneRepository.save(personne);

        //read


        List<Personne> personneList = personneRepository.findAll();
        personneList.forEach(personneFromList -> {
            System.out.println(personneFromList.toString());
        });


    }

}
