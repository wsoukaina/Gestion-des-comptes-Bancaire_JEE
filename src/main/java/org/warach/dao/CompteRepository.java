package org.warach.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.warach.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, String>{

}
