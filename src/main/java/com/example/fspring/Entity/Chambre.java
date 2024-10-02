package com.example.fspring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @ManyToOne
    private Bloc bloc;

    @OneToMany
    private Set<Reservation> reservation;


}

