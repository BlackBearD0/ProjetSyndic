package com.pfa.syndicbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("R")
public class Residant extends Personne{
    private Long numero_residant;

    @ManyToOne
    private ResidantAppartement residantAppartement;
}
