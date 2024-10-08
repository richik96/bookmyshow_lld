package com.project.book_my_show_oct24.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.book_my_show_oct24.Models.User;
import java.util.List;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    @Override         
    Optional<User> findById(Long userId);           //optional class prevents a empty object to throw null point exception by isPresent() method

    Optional<User> findByEmail(String email);           //internally JPA creates the sql query for you


    /*
     * To create any repository follow 2 steps :
     * 
     * 1. Make the Repository as an Interface.
     * 2. Extend the Repository Interface with JpaRepository.
     * 
     */

     User save(User user);

}
