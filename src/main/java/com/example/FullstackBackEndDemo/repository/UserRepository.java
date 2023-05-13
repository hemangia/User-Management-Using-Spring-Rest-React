package com.example.FullstackBackEndDemo.repository;

import com.example.FullstackBackEndDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
