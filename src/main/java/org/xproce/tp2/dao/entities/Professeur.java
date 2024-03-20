package org.xproce.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String name;
    private Date d_aff ;
    @OneToOne(mappedBy = "professeur")
    private Course course;

}
