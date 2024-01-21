package com.Pratyagra.VaakLipi.User.Controller;

import com.Pratyagra.VaakLipi.User.Entity.UserEntity;
import com.Pratyagra.VaakLipi.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/createUser")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);
    }

    @PostMapping("/updateUser")
    public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity userEntity){
        return userService.updateUser(userEntity);
    }

    @GetMapping("/getUser")
    public  ResponseEntity<UserEntity> getUser(@RequestParam Map<String , String> params){
        String username = params.get("username");
        String eMail = params.get("eMail");
        return userService.getUser(username,eMail);
    }


    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam Map<String,String> params){
        String username = params.get("username");
        String eMail = params.get("email");
        return userService.deleteUser(username,eMail);
    }

}
