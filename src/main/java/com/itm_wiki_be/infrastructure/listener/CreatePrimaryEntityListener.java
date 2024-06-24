package com.itm_wiki_be.infrastructure.listener;

import com.itm_wiki_be.entity.base.PrimaryBase;
import jakarta.persistence.PrePersist;

import java.util.UUID;

public class CreatePrimaryEntityListener {

    @PrePersist
    private void onCreate(PrimaryBase entity) {
        entity.setId(UUID.randomUUID().toString());
    }
}
