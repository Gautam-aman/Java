package com.cfs.jwt.Repo;

import com.cfs.jwt.entity.UserInfo;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo , Integer> {

    Optional <UserInfo> findByEmail(String email);


}
