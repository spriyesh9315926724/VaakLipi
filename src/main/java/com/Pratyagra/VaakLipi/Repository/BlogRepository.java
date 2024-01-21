package com.Pratyagra.VaakLipi.Repository;

import com.Pratyagra.VaakLipi.Blogs.Entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BlogRepository extends JpaRepository<BlogEntity , UUID> {
}
