package com.Pratyagra.VaakLipi.BaseEntity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
    @Column( nullable = false , unique = true )
    private UUID Id;

    @CreatedDate
    @Column(nullable = false , unique = false )
    private Date createdDate;

}
