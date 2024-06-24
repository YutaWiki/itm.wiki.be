package com.itm_wiki_be.entity;

import com.itm_wiki_be.entity.base.PrimaryBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate
@Table(name = "file_mng")
public class FileMngEntity extends PrimaryBase {

    @Column
    private String fileName;

    @Column
    private String fileType;

    @Column
    private Long fileSize;

    @Column
    private String filePath;

    @Column
    private String producerCode;

    @Column
    private UUID producerId;
}
