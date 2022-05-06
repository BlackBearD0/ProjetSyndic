package com.pfa.syndicbackend.repositories;


import com.pfa.syndicbackend.entities.Residant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidantRepository extends JpaRepository<Residant, Long> {
}
