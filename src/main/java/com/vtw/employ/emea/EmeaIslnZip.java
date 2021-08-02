package com.vtw.employ.emea;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class EmeaIslnZip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bplcSn; //사업장연번
    private String ty; //유형
    private String bcno; //사업장고객번호
    private String bzmn; //사업장관리번호
    private String bpcn; //사업장명
    private String tpsn; //대상자연번
    private String tcno; //대상자고객번호
    private String zip; //우편번호

    @Builder
    public EmeaIslnZip(Long id, String bplcSn, String ty, String bcno, String bzmn, String bpcn, String tpsn, String tcno, String zip) {
        this.id = id;
        this.bplcSn = bplcSn;
        this.ty = ty;
        this.bcno = bcno;
        this.bzmn = bzmn;
        this.bpcn = bpcn;
        this.tpsn = tpsn;
        this.tcno = tcno;
        this.zip = zip;
    }
}
