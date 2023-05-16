package com.arjunshaji.user.repository;

import com.arjunshaji.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByDeptCode(String code);
}
