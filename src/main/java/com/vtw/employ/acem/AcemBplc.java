package com.vtw.employ.acem;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@ToString
public class AcemBplc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ty; //유형
    private String bcno; //사업장고객번호
    private String bzmn; //사업장관리번호
    private String bpcn; //사업장명
    private String pstcYn; //우선지원대상기업여부
    private String ltrsYn; //우선지원대상기업여부
    private String mlpzYn; //우선지원대상기업여부
    private String nbsp; //지원인원
    private String spam; //지원금액
    private String rqde; //신청일

    @Builder
    public AcemBplc(Long id, String ty, String bcno, String bzmn, String bpcn, String pstcYn, String ltrsYn, String mlpzYn, String nbsp, String spam, String rqde) {
        this.id = id;
        this.ty = ty;
        this.bcno = bcno;
        this.bzmn = bzmn;
        this.bpcn = bpcn;
        this.pstcYn = pstcYn;
        this.ltrsYn = ltrsYn;
        this.mlpzYn = mlpzYn;
        this.nbsp = nbsp;
        this.spam = spam;
        this.rqde = rqde;
    }

    public AcemBplc() {
        this.id = 0L;
        this.ty = "";
        this.bcno = "";
        this.bzmn = "";
        this.bpcn = "";
        this.pstcYn = "";
        this.ltrsYn = "";
        this.mlpzYn = "";
        this.nbsp = "";
        this.spam = "";
        this.rqde = "";
    }
}
