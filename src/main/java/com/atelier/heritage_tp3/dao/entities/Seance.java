package com.atelier.heritage_tp3.dao.entities;

import jakarta.persistence.*;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("SEANCE")
public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private Date Date;
    private Date h_debut;
    private Date h_fin;

    @Override
    public String toString() {
        return "Seance{" +
                "id=" + id +
                "date"+ Date +
                ",date debut='" + h_debut + '\'' +
                ",date fin=" + h_fin +
                '}';
    }

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Etudiant> utilisateurs= new ArrayList<>();

    @ManyToOne
    private Cours cours;

}
