package com.yflash.tech.SpringJPAQueries.repository;

import com.yflash.tech.SpringJPAQueries.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    // In this approach of NamedQuery, the query is defined at the entity level itself
    @Query(name = "UserEntity.findUserById")
    UserEntity findUser(@Param("id") Integer id);

}
