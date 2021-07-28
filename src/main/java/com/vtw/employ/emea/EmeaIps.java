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

    private String bplcSn;
    private String bcno;
    private String bzmn;
    private String bpcn;
    private String tpsn;
    private String tcno;
    private String lbbrBrcpYn;
    private String epde;
    private String mslr;
    private String sprpBgde;
    private String sprpEnde;
    private String spam;
    private String ptPgid;
    private String ptPgnm;

    @Builder
    public EmeaIps(Long id, String bplcSn, String bcno, String bzmn, String bpcn, String tpsn, String tcno, String lbbrBrcpYn, String epde, String mslr, String sprpBgde, String sprpEnde, String spam, String ptPgid, String ptPgnm) {
        this.id = id;
        this.bplcSn = bplcSn; //사업장연번
        this.bcno = bcno; //사업장고객번호
        this.bzmn = bzmn; //사업장관리번호
        this.bpcn = bpcn; //사업장명
        this.tpsn = tpsn; //대상자연번
        this.tcno = tcno; //대상자고객번호
        this.lbbrBrcpYn = lbbrBrcpYn; //최종이직전 사업장 관련 사업주 해당여부
        this.epde = epde; //고용일
        this.mslr = mslr; //임금월액
        this.sprpBgde = sprpBgde; //지원기간시작일
        this.sprpEnde = sprpEnde; //지원기간종료일
        this.spam = spam; //지원금액
        this.ptPgid = ptPgid; //참여프로그램ID
        this.ptPgnm = ptPgnm; //참여프로그램명
    }
}
