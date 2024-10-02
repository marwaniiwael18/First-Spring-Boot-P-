package com.example.fspring.Entity;
import java.util.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
@OneToOne(cascade = CascadeType.ALL,mappedBy = "foyer")
    private Universite universite;
@OneToMany (cascade = CascadeType.ALL,mappedBy = "foyer")
    private Set<Bloc> bloc;
}
