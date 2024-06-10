package com.itm_wiki_be.core.common.pageable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PageableRequest {

    private int current = PaginationConstant.DEFAULT_PAGE;
    private int size = PaginationConstant.DEFAULT_SIZE;
    private String sortField = "id";
    private String sortType = "";
}
