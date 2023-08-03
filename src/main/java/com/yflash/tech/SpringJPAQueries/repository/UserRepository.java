package com.yflash.tech.SpringJPAQueries.repository;

import com.yflash.tech.SpringJPAQueries.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

//    @Query(value = "SELECT u FROM UserEntity u WHERE u.Id = :id")                           // named query approach 1
//    @Query(name = "UserEntity.findUserById")                                           // named query appraoch 2 (query defined at entity level)
    @Query(nativeQuery = true)         // native query
    UserEntity findUser(@Param("id") Integer id);


    // the derived queries allows Hibernate to generate the query by itself based on the method name
    List<UserEntity> findByFirstName(String firstName);

}
