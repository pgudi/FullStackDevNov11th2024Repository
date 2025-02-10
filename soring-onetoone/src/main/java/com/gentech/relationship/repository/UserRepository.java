package com.gentech.relationship.repository;

import com.gentech.relationship.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
