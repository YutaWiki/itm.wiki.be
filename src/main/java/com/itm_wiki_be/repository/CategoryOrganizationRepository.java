package com.itm_wiki_be.repository;

import com.itm_wiki_be.entity.CategoryOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(CategoryOrganizationRepository.NAME)
public interface CategoryOrganizationRepository extends JpaRepository<CategoryOrganization, String> {

    String NAME = "BaseCategoryOrganizationRepository";
}
