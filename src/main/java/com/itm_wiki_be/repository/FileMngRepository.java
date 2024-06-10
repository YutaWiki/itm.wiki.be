package com.itm_wiki_be.repository;

import com.itm_wiki_be.entity.FileMngEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FileMngRepository extends JpaRepository<FileMngEntity, UUID> {
}
