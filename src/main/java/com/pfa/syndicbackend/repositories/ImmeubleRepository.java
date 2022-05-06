package com.pfa.syndicbackend.repositories;

import com.pfa.syndicbackend.entities.Immeuble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImmeubleRepository extends JpaRepository<Immeuble, Long> {
}
