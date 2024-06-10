package com.itm_wiki_be.core.common.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CodeMngDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String value;

    private String label;

    private String type;
}
