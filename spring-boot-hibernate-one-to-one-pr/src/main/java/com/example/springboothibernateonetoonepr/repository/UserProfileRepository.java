package com.example.springboothibernateonetoonepr.repository;

import com.example.springboothibernateonetoonepr.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
