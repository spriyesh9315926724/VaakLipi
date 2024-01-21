package com.Pratyagra.VaakLipi.Repository;

import com.Pratyagra.VaakLipi.Comments.Entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CommentsRepository extends JpaRepository<CommentEntity , UUID> {
}
