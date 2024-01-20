package com.Pratyagra.VaakLipi.Comments.Entity;

import com.Pratyagra.VaakLipi.BaseEntity.BaseEntity;
import com.Pratyagra.VaakLipi.Blogs.Entity.BlogEntity;
import com.Pratyagra.VaakLipi.User.Entity.UserEntity;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "COMMENTS")
public class CommentEntity extends BaseEntity {

    @Column(length = 500)
    private String commentContent;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private BlogEntity blog;
}
