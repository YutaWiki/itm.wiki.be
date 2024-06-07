package com.itm_wiki_be.entity.base;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class IsIdentifiedRequest {
    private UUID id;
}
