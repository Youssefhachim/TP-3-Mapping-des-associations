package com.atelier.heritage_tp3.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("COURS")
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer Id;

    private String titre;

    private String description;

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description=" + description +
                '}';
    }

    @ManyToOne
    private Cours cours;

    @OneToMany(mappedBy = "cours")
    private Collection<Seance> seances;
}
