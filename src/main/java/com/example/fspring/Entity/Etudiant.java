package com.example.fspring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.SpringVersion;
import java.util.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private  Set<Reservation> reservation;

}
