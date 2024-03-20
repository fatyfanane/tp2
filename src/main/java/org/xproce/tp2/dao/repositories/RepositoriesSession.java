package org.xproce.tp2.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.tp2.dao.entities.Session;

public interface RepositoriesSession extends JpaRepository<Session,Integer> {
}
