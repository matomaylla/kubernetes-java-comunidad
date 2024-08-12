package com.matomaylla.demoPod.repository;

import com.matomaylla.demoPod.model.User;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    default User findRandomUser() {
        long count = count();
        int randomIndex = (int) (Math.random() * count);
        return findAll(PageRequest.of(randomIndex, 1)).getContent().get(0);
    }

}
