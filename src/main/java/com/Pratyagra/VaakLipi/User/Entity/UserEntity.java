package com.Pratyagra.VaakLipi.User.Entity;


import com.Pratyagra.VaakLipi.BaseEntity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.UUID;

@ToString
@Getter
@Setter
@Entity(name = "USERS")
public class  UserEntity extends BaseEntity {

    @Column(nullable = false , unique = false , length = 200)
    @JsonProperty("username")
    private String userName;

    @Column(nullable = false , unique = false , length = 200)
    @JsonProperty("password")
    private String password;

    @Column(unique = false , length = 300)
    @JsonProperty("bio")
    private String bio;

    @Column(nullable = false , unique = true , length = 200)
    @JsonProperty("email")
    private String eMail ;


    public UserEntity() {}

    public UserEntity(String userName , String password){
        this.userName = userName;
        this.password = password;
    }

    public UserEntity(String userName , String password , String eMail){
        this(userName , password);
        this.eMail = eMail;
    }

    public UserEntity(String userName , String password , String bio , String eMail){
        this(userName , password , eMail);
        this.bio = bio;
    }
}
