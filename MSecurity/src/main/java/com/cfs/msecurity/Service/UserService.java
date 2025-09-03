package com.cfs.msecurity.Service;


import com.cfs.msecurity.Dots.UserRequest;
import com.cfs.msecurity.Repo.RoleRepo;
import com.cfs.msecurity.Repo.UserRepo;
import com.cfs.msecurity.entity.AppUser;
import com.cfs.msecurity.entity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;


    private PasswordEncoder encoder;

    public String saveUsers(List<UserRequest> usersRequest) {
        for (UserRequest req :  usersRequest) {
            AppUser user = new AppUser();
            user.setUsername(req.getUsername());
            user.setPassword(encoder.encode(req.getPassword()));
            user.setEnabled(true);
            Set<Roles> roleset = new HashSet<>();
            for (String roleName : req.getRoles() ) {
                Roles role = roleRepo.findByUsername(roleName)
                        .orElseGet(()->{
                           Roles newrole = new Roles();
                           newrole.setRolename(roleName);
                           return roleRepo.save(newrole);
                        });
                roleset.add(role);

            }
            user.setRoles(roleset);
            userRepo.save(user);
        }

        return null;
    }


}
