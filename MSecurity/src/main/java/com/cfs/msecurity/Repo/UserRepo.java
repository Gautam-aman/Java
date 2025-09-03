package com.cfs.msecurity.Repo;

import com.cfs.msecurity.entity.AppUser;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.Optional;

public interface UserRepo extends JpaRepositoryImplementation<AppUser, Long> {

    Optional<AppUser> findByUsername(String name);

}
