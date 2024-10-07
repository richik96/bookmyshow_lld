package com.project.book_my_show_oct24.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.book_my_show_oct24.Models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    @Override
    default Optional<User> findById(Long id) {
        
    }

    /*
     * To create any repository follow 2 steps :
     * 
     * 1. Make the Repository as an Interface.
     * 2. Extend the Repository Interface with JpaRepository.
     * 
     */
}
