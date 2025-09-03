package com.cfs.msecurity.Service;


import com.cfs.msecurity.Repo.UserRepo;
import com.cfs.msecurity.entity.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException{
        AppUser user = userRepo.findByUsername(name)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        System.out.println("founded");
        return new User(user.getUsername() , user.getPassword(), user.isEnabled() , true , true , true ,
        user.getRoles().stream().map(role->new SimpleGrantedAuthority(role.getRolename())).toList());
    }

}
