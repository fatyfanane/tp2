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
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    private Date date ;
    private Date h_debut;
    private Date h_fin;

    @ManyToOne
    private Course course;
    @ManyToMany(mappedBy = "sessions",fetch = FetchType.EAGER)
    private Collection <Student>students= new ArrayList<>();

}
