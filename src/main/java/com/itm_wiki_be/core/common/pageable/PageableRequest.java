package com.itm_wiki_be.core.common.pageable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageableRequest {
    private int page = PaginationConstant.DEFAULT_PAGE;
    private int size = PaginationConstant.DEFAULT_SIZE;
}
