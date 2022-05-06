package com.pfa.syndicbackend.repositories;

import com.pfa.syndicbackend.entities.Syndic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SyndicRepository extends JpaRepository<Syndic, Long> {
}
