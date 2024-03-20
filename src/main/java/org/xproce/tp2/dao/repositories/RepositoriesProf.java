package org.xproce.tp2.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.tp2.dao.entities.Professeur;

public interface RepositoriesProf extends JpaRepository<Professeur,Integer> {
}
