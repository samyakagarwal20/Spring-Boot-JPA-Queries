package com.yflash.tech.SpringJPAQueries.repository;

import com.yflash.tech.SpringJPAQueries.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    // Using entity name and fields for query rather than the actual table name and its columns for NamedQuery
    @Query(value = "SELECT u FROM UserEntity u WHERE u.Id = :id")
    UserEntity findUser(@Param("id") Integer id);

}
