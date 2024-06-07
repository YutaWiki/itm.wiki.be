package com.itm_wiki_be.core.common.pageable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseObject {

    private boolean isSuccess = false;
    private Object data;
    private String message;

    public <T> ResponseObject(T obj) {
        processResponseObject(obj);
    }

    public void processResponseObject(Object obj) {
        if (obj != null) {
            this.isSuccess = true;
            this.data = obj;
        }
    }
}

