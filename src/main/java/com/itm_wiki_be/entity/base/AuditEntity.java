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

    @Column(updatable = false)
    private Long createdDate;

    @Column
    private Long lastModifiedDate;

    @Column(updatable = false)
    private String createdBy;

    @Column
    private String lastModifiedBy;

    @Column
    private Integer deleteFlag = 0;
}
