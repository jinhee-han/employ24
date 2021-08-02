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
public class EmeaIps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bplcSn; //사업장연번
    private String bcno; //사업장고객번호
    private String bzmn; //사업장관리번호
    private String bpcn; //사업장명
    private String tpsn; //대상자연번
    private String tcno; //대상자고객번호
    private String lbbrBrcpYn; //최종이직전 사업장 관련 사업주 해당여부
    private String epde; //고용일
    private String mslr; //임금월액
    private String sprpBgde; //지원기간시작일
    private String sprpEnde; //지원기간종료일
    private String spam; //지원금액
    private String ptPgid; //참여프로그램ID
    private String ptPgnm; //참여프로그램명

    @Builder
    public EmeaIps(Long id, String bplcSn, String bcno, String bzmn, String bpcn, String tpsn, String tcno, String lbbrBrcpYn, String epde, String mslr, String sprpBgde, String sprpEnde, String spam, String ptPgid, String ptPgnm) {
        this.id = id;
        this.bplcSn = bplcSn;
        this.bcno = bcno;
        this.bzmn = bzmn;
        this.bpcn = bpcn;
        this.tpsn = tpsn;
        this.tcno = tcno;
        this.lbbrBrcpYn = lbbrBrcpYn;
        this.epde = epde;
        this.mslr = mslr;
        this.sprpBgde = sprpBgde;
        this.sprpEnde = sprpEnde;
        this.spam = spam;
        this.ptPgid = ptPgid;
        this.ptPgnm = ptPgnm;
    }
}
