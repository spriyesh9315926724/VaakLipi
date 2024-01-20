package com.Pratyagra.VaakLipi.Blogs.Entity;

import com.Pratyagra.VaakLipi.BaseEntity.BaseEntity;
import com.Pratyagra.VaakLipi.User.Entity.UserEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name="BLOG")
public class BlogEntity extends BaseEntity {
    @Column(nullable = false , unique = true , length = 500)
    private String header;

    @Column(nullable = false , unique = false , length = 500)
    private String subHeading;

    @Column(unique = false, length = 2000)
    private String blogContent;

    @ManyToOne
    private UserEntity user;

}
