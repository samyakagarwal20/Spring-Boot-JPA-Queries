package com.yflash.tech.SpringJPAQueries.repository;

import com.yflash.tech.SpringJPAQueries.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

//    @Query(value = "SELECT * FROM USER u WHERE u.Id = :id", nativeQuery = true)         // native query
//    @Query(value = "SELECT u FROM UserEntity u WHERE u.Id = :id")                           // named query approach 1
    @Query(name = "UserEntity.findUserById")                                           // named query appraoch 2 (query defined at entity level)
    UserEntity findUser(@Param("id") Integer id);

}
