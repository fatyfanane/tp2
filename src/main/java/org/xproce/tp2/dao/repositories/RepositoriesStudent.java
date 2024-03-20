package org.xproce.tp2.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.tp2.dao.entities.Student;

public interface RepositoriesStudent extends JpaRepository<Student,Integer> {
}
