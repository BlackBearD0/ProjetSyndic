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
@DiscriminatorValue("S")
public class Syndic extends Personne{
    private Long numero_syndic;

    @ManyToOne
    private SyndicImmeuble syndicImmeuble;
}
