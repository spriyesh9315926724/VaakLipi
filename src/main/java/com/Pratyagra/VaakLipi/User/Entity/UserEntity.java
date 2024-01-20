package com.Pratyagra.VaakLipi.User.Entity;


import com.Pratyagra.VaakLipi.BaseEntity.BaseEntity;
import jakarta.persistence.*;

import java.util.UUID;


@Entity(name = "USERS")
public class  UserEntity extends BaseEntity {

    @Column(nullable = false , unique = false , length = 200)
    private String userName;

    @Column(nullable = false , unique = false , length = 200)
    private String password;

    @Column(unique = false , length = 300)
    private String bio;

    @Column(nullable = false , unique = true , length = 200)
    private String eMail ;


}
