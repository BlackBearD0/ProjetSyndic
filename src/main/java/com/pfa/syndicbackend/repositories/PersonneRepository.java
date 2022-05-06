package com.pfa.syndicbackend.repositories;

import com.pfa.syndicbackend.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
