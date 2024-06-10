package com.itm_wiki_be.infrastrure.listener;

import com.itm_wiki_be.entity.base.AuditEntity;
import com.itm_wiki_be.infrastrure.constant.IsDelete;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Date;

public class AuditEntityListener {

    @PrePersist
    private void onCreate(AuditEntity entity) {
        entity.setCreatedDate(getCurrentTime().getTime());
        entity.setLastModifiedDate(getCurrentTime().getTime());
        entity.setIsDelete(IsDelete.ACTIVE);
    }

    @PreUpdate
    private void onUpdate(AuditEntity entity) {
        entity.setLastModifiedDate(getCurrentTime().getTime());
    }

    private Date getCurrentTime() {
        return new Date();
    }
}
