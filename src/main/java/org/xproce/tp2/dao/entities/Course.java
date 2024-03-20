package org.xproce.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String title;
    private String description ;
    @OneToOne
    private Professeur professeur;

   @OneToMany(mappedBy = "course")
    private Collection <Session> sessions=new ArrayList<>();



}
