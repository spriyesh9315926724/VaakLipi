package com.Pratyagra.VaakLipi.Comments.Entity;

import com.Pratyagra.VaakLipi.BaseEntity.BaseEntity;
import com.Pratyagra.VaakLipi.Blogs.Entity.BlogEntity;
import com.Pratyagra.VaakLipi.User.Entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity(name = "COMMENTS")
public class CommentEntity extends BaseEntity {

    @Column(length = 500)
    @JsonProperty("commentcontent")
    private String commentContent;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id")
    private UserEntity user;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id")
    private BlogEntity blog;

    public CommentEntity(){}
}
