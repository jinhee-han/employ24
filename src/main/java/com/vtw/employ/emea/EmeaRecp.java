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
public class EmeaRecp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bplcSn; //사업장연번
    private String bcno; //사업장고객번호
    private String bzmn; //사업장관리번호
    private String bpcn; //사업장명
    private String cvplRcno; //민원접수번호 
    private String fmcd; //서식코드
    private String fmnm; //서식명
    private String pmde; //지급일
    private String pmam; //지급액

    @Builder
    public EmeaRecp(Long id, String bplcSn, String bcno, String bzmn, String bpcn, String cvplRcno, String fmcd, String fmnm, String pmde, String pmam) {
        this.id = id;
        this.bplcSn = bplcSn;
        this.bcno = bcno;
        this.bzmn = bzmn;
        this.bpcn = bpcn;
        this.cvplRcno = cvplRcno;
        this.fmcd = fmcd;
        this.fmnm = fmnm;
        this.pmde = pmde;
        this.pmam = pmam;
    }
}
