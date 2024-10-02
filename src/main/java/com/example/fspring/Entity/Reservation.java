package com.example.fspring.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;
import java.util.Date;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;

    @ManyToMany
    private Set<Etudiant> etudiant;

}
