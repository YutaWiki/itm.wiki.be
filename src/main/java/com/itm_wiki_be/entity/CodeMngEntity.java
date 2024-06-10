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

    @Column(name = "cd_id")
    private String cdId;

    @Column(name = "cd_category")
    private String cdCategory;

    @Column(name = "cd_name")
    private String cdName;

    @Column(name = "cd_key")
    private String cdKey;
}
