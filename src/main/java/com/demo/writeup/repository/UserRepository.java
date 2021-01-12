package com.demo.writeup.repository;


import com.demo.writeup.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    @Transactional
    @Modifying
    @Query(value = "UPDATE user SET address = ?1 WHERE user_id = ?2 ", nativeQuery = true)
    int updateUserAddress(String address, Integer user_id);
}
