package com.example.fspring.Entity;
import java.util.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idBloc;
    private String nomBloc;
    private long capacitebloc;
    @ManyToOne
    private Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "bloc")
    private Set<Chambre> chambre;
}
