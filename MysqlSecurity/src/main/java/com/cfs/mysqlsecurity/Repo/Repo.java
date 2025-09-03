package com.cfs.mysqlsecurity;

import com.cfs.mysqlsecurity.DB.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Repo extends JpaRepository <Roles, Long>{

    Optional<Roles> findbyname(String name);

}
