package com.itm_wiki_be.util;

import com.itm_wiki_be.core.common.pageable.PageableRequest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageableCommon {

    public static Pageable getPageable(PageableRequest pageableRequest) {
        Sort sort = sort(pageableRequest.getSortField(), pageableRequest.getSortType());
        if (sort == null) {
            return PageRequest.of(pageableRequest.getCurrent(), pageableRequest.getSize());
        }
        return PageRequest.of(pageableRequest.getCurrent(), pageableRequest.getSize(), sort);
    }

    public static Sort sort(String sortField, String sortType) {
        if (sortField != null && !sortField.isEmpty()) {
            return sortType.equalsIgnoreCase("desc") ? Sort.by(Sort.Direction.DESC, sortField) : Sort.by(Sort.Direction.ASC, sortField);
        } else {
            return null;
        }
    }
}
