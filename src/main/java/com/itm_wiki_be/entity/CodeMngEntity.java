package com.itm_wiki_be.entity;

import com.itm_wiki_be.entity.base.PrimaryBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Immutable
@Table(name = "code_mng")
public class CodeMngEntity extends PrimaryBase {

    @Column
    private String cdId;

    @Column
    private String cdCategory;

    @Column
    private String cdName;

    @Column
    private String cdKey;
}
