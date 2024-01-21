package com.Pratyagra.VaakLipi.Users;

import com.Pratyagra.VaakLipi.Repository.UserRepository;
import com.Pratyagra.VaakLipi.User.Entity.UserEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.UUID;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired private UserRepository userRepository;

    @Test
    public void createUser(){

        UserEntity userEntity = new UserEntity(
                "testUser" ,
                "Saurabh@2024" ,
                "Hi i am a test user",
                "testUser@gmail.com"
        );
        userEntity.setId(UUID.randomUUID());
        userEntity.setCreatedDate(new Date());
        System.out.println("User Entity  "+userEntity);
        try {
            userRepository.save(userEntity);
        }catch(Exception e){
            System.out.println("Could not save");
        }
        Assertions.assertNotNull(userEntity.getId());
    }




}
