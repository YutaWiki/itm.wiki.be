package com.itm_wiki_be.repository;

import com.itm_wiki_be.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(UserRepository.NAME)
public interface UserRepository extends JpaRepository<User, String> {

    String NAME = "BaseUserRepository";
}
