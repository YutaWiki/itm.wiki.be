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

    @Column(name = "name")
    @Nationalized
    private String name;

    @Column(name = "username", length = EntityProperties.LENGTH_NAME)
    private String username;

    @Column(name = "category_organization_id", length = EntityProperties.LENGTH_ID)
    private String categoryOrganizationId;

    @Column(name = "email", length = EntityProperties.LENGTH_EMAIL)
    private String email;

    @Column(name = "phone_number", length = EntityProperties.LENGTH_PHONE)
    private String phoneNumber;

    @Column(name = "address", length = EntityProperties.LENGTH_DESCRIPTION)
    @Nationalized
    private String address;

    @Column(name = "tax_code", length = EntityProperties.LENGTH_CODE)
    private String taxCode;

    @Column(name = "url_image_logo", length = EntityProperties.LENGTH_URL)
    private String urlImageLogo;
}
