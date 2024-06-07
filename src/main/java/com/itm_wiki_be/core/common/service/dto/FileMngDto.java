package com.itm_wiki_be.core.common.service.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
public class FileMngDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private int fimSubFileId;
    private String fimFileCategory;
    private String fimFileName;
    private String fimFilePath;
    private String fimFileExt;
    private long fimFileSize;
    private String fimUseYn;
    private long fimReferKeyId;
    private String fimFileOrgName;
    private String fimSectionName;
    private int deleteFlag;

}
