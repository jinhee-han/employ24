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
public class EmeaInsb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String bplcSn; //사업장연번
    private String bcno; //사업장고객번호
    private String bzmn; //사업장관리번호
    private String bpcn; //사업장명
    private String tcno; //대상자고객번호
    private String aqde; //취득일
    private String frde; //상실일

    @Builder
    public EmeaInsb(Long id, String bplcSn, String bcno, String bzmn, String bpcn, String tcno, String aqde, String frde) {
        this.id = id;
        this.bplcSn = bplcSn;
        this.bcno = bcno;
        this.bzmn = bzmn;
        this.bpcn = bpcn;
        this.tcno = tcno;
        this.aqde = aqde;
        this.frde = frde;
    }
}
