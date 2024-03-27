package com.atelier.heritage_tp3.dao.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("ETUD")
public class Etudiant extends Personne {

    private String Matricule;

    @ManyToMany(mappedBy = "etudiants", fetch = FetchType.EAGER)
    private Collection<Seance> seances= new ArrayList<>();
}
