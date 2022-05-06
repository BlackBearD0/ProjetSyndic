package com.pfa.syndicbackend.repositories;

import com.pfa.syndicbackend.entities.Appartement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppartementRepository extends JpaRepository<Appartement, Long> {
}
