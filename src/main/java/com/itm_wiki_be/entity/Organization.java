package com.itm_wiki_be.entity;

import com.itm_wiki_be.entity.base.PrimaryBase;
import com.itm_wiki_be.infrastructure.constant.EntityProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate
@Table(name = "organization")
public class Organization extends PrimaryBase {

    @Column
    @Nationalized
    private String name;

    @Column(length = EntityProperties.LENGTH_NAME)
    private String username;

    @Column(length = EntityProperties.LENGTH_ID)
    private String categoryOrganizationId;

    @Column(length = EntityProperties.LENGTH_EMAIL)
    private String email;

    @Column(length = EntityProperties.LENGTH_PHONE)
    private String phoneNumber;

    @Column(length = EntityProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String address;

    @Column(length = EntityProperties.LENGTH_CODE)
    private String taxCode;

    @Column(length = EntityProperties.LENGTH_URL)
    private String urlImageLogo;
}
