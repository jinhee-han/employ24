package com.vtw.employ.openAPI;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Bplc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bplcCno; //고객번호
    private String bplcIdntfcNo; //사업장관리번호
    private String cstmrNm; //사업장명
    private String lsepYn; //대규모기업여부
    private String poepYn; //우선대상기업여부
    private String inprCt; //피보험자수
    private String bplcRgcd; //사업장지역코드
    private String bplcIdcd; //사업장업종코드

    @Builder
    public Bplc(Long id, String bplcCno, String bplcIdntfcNo, String cstmrNm, String lsepYn, String poepYn, String inprCt, String bplcRgcd, String bplcIdcd) {
        this.id = id;
        this.bplcCno = bplcCno;
        this.bplcIdntfcNo = bplcIdntfcNo;
        this.cstmrNm = cstmrNm;
        this.lsepYn = lsepYn;
        this.poepYn = poepYn;
        this.inprCt = inprCt;
        this.bplcRgcd = bplcRgcd;
        this.bplcIdcd = bplcIdcd;
    }
}
