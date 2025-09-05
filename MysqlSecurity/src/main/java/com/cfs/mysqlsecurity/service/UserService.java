package com.cfs.mysqlsecurity.service;


import com.cfs.mysqlsecurity.DB.Roles;
import com.cfs.mysqlsecurity.DB.UserEntity;
import com.cfs.mysqlsecurity.Repo.Repo;
import com.cfs.mysqlsecurity.Repo.UserRepo;
import com.cfs.mysqlsecurity.config.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService  {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private Repo repo;


    private PasswordEncoder encoder;

    public void saveusers(List<UserRequest> userrequest){

        for (UserRequest u : userrequest) {
            UserEntity userEntity = new UserEntity();
            userEntity.setUsername(u.getUsername());
            userEntity.setPassword(encoder.encode(u.getPassword()));
            userEntity.setEnabled(true);
            Set<Roles> roles = new HashSet<Roles>();
            for (String rolename : u.getRoles()) {
                Optional<UserEntity> role = Repo.findbyusername(u.getUsername())
                        .orElse(()->{
                            Roles role1 = new Roles();
                            role1.setNameOfRole(rolename);
                        });
            }

        }

    }


}
