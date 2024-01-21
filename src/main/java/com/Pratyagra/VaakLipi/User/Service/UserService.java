package com.Pratyagra.VaakLipi.User.Service;

import com.Pratyagra.VaakLipi.Repository.UserRepository;
import com.Pratyagra.VaakLipi.User.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    //To create a new User
    public ResponseEntity<UserEntity> createUser( UserEntity user){
        try{
            userRepo.save(user);
            userRepo.flush();
            return ResponseEntity.accepted().body(user);
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }

    //to update an existing user
    public ResponseEntity<UserEntity> updateUser(UserEntity user){
        try{
            userRepo.save(user);
            userRepo.flush();
            return ResponseEntity.accepted().body(user);
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().build();
    }


    public ResponseEntity<String> deleteUser( String userName , String eMail ){
        try{
            String message = userRepo.deleteUserEntitiesByUserName(userName);
            ResponseEntity.accepted().body(message);
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body("Not able to find the record");
    }

    public ResponseEntity<UserEntity> getUser(String userName , String eMail){
        try{
            List<UserEntity> users = userRepo.findUserEntitiesByUserName(userName);
            UserEntity user = users.stream().filter(user1->user1.getEMail().equalsIgnoreCase(eMail)).findFirst().orElseThrow();
            return ResponseEntity.accepted().body(user);
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.badRequest().body(null);
    }

}
