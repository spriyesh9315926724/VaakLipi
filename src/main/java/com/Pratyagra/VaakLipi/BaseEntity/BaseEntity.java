package com.Pratyagra.VaakLipi.BaseEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@ToString
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
    @Column( nullable = false , unique = true )
    private UUID Id;

    @CreatedDate
    @Column(nullable = false , unique = false )
    @JsonProperty("createddate")
    private Date createdDate;

    public BaseEntity(){}

}
