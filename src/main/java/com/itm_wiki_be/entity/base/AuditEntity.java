package com.itm_wiki_be.entity.base;

import com.itm_wiki_be.infrastructure.listener.AuditEntityListener;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditEntityListener.class)
public abstract class AuditEntity implements Serializable {

    @Column(name = "created_date", updatable = false)
    private Long createdDate;

    @Column(name = "last_modified_date")
    private Long lastModifiedDate;

    @Column(name = "created_by", updatable = false)
    private String createdBy;

    @Column(name = "last_modified_by")
    private String lastModifiedBy;

    @Column(name = "delete_flag")
    private Integer deleteFlag = 0;
}
