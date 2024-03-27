package com.atelier.heritage_tp3.dao.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("PROF")
public class Professeur extends Personne {

    private Date d_affectation;

    @OneToMany(mappedBy = "professeur")
    private Collection<Cours> cours;
}
