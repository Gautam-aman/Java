package com.cfs.mysqlsecurity.Repo;

import com.cfs.mysqlsecurity.DB.Roles;
import com.cfs.mysqlsecurity.DB.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Repo extends JpaRepository <UserEntity, String >{

    static Optional<UserEntity> findbyusername(String name) {
        return null;
    }

}
