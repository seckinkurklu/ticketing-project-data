package com.cydeo.repository;

import com.cydeo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String username);

    @Transactional   //This is optional. One we put on UserServiceImpl at class level is enough. Application works that way also.
    void deleteByUserName(String username);

    List<User> findByRoleDescriptionIgnoreCase(String description);

}
