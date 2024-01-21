package com.Pratyagra.VaakLipi.Repository;

import com.Pratyagra.VaakLipi.User.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity , UUID> {

    public String deleteUserEntitiesByUserName(String username);

    public List<UserEntity> findUserEntitiesByUserName(String username);

}
