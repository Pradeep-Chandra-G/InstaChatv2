package com.pradeep.InstaChatv2.repo;

import com.pradeep.InstaChatv2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String username);
}
