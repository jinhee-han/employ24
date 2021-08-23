package com.vtw.employ.acem;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@ToString
public class AcemMnan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bplcSn; //사업장연번
    private String bcno; //사업장고객번호
    private String bzmn; //사업장관리번호
    private String bpcn; //사업장명
    private String tpsn; //대상자연번
    private String tcno; //대상자고객번호
    private String stdrBgde; //기준시작일
    private String stdrEnde; //기준종료일
    private String mnan; //월평균보수액

    @Builder
    public AcemMnan(Long id, String bplcSn, String bcno, String bzmn, String bpcn, String tpsn, String tcno, String stdrBgde, String stdrEnde, String mnan) {
        this.id = id;
        this.bplcSn = bplcSn;
        this.bcno = bcno;
        this.bzmn = bzmn;
        this.bpcn = bpcn;
        this.tpsn = tpsn;
        this.tcno = tcno;
        this.stdrBgde = stdrBgde;
        this.stdrEnde = stdrEnde;
        this.mnan = mnan;
    }

    public AcemMnan() {
        this.id = 0L;
        this.bplcSn = "";
        this.bcno = "";
        this.bzmn = "";
        this.bpcn = "";
        this.tpsn = "";
        this.tcno = "";
        this.stdrBgde = "";
        this.stdrEnde = "";
        this.mnan = "";
    }

}
