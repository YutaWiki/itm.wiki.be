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
@Table(name = "user")
public class User extends PrimaryBase {

    @Column(name = "name")
    @Nationalized
    private String name;

    @Column(name = "email", length = EntityProperties.LENGTH_EMAIL)
    private String email;

    @Column(name = "phone_number", length = EntityProperties.LENGTH_PHONE)
    private String phoneNumber;

    @Column(name = "organization_id", length = EntityProperties.LENGTH_ID)
    private String organizationId;
}
