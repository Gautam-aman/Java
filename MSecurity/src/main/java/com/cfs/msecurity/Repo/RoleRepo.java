package com.cfs.msecurity.Repo;


import com.cfs.msecurity.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface RoleRepo extends JpaRepository<Roles, Long> {

    Optional<Roles> findByUsername(String name);

}
