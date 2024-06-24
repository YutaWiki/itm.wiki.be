package com.itm_wiki_be.repository;

import com.itm_wiki_be.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(OrganizationRepository.NAME)
public interface OrganizationRepository extends JpaRepository<Organization, String> {

    String NAME = "BaseOrganizationRepository";
}
