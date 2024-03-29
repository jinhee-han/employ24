package com.vtw.employ.emea;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EmeaEmpg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bplcSn; //사업장연번
    private String bcno; //사업장고객번호
    private String bzmn; //사업장관리번호
    private String bpcn; //사업장명
    private String tpsn; //대상자연번
    private String tcno; //대상자고객번호
    private String empmPgid; //취업프로그램ID
    private String empmPgnm; //취업프로그램명
    private String bgde; //시작일
    private String ende; //종료일

    @Builder
    public EmeaEmpg(Long id, String bplcSn, String bcno, String bzmn, String bpcn, String tpsn, String tcno, String empmPgid, String empmPgnm, String bgde, String ende) {
        this.id = id;
        this.bplcSn = bplcSn;
        this.bcno = bcno;
        this.bzmn = bzmn;
        this.bpcn = bpcn;
        this.tpsn = tpsn;
        this.tcno = tcno;
        this.empmPgid = empmPgid;
        this.empmPgnm = empmPgnm;
        this.bgde = bgde;
        this.ende = ende;
    }
}
