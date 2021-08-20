package com.vtw.employ.openAPI;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@ToString
public class Ips {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bplcCno; //사업장고객번호
    private String bplcIdntfcNo; //사업장관리번호
    private String cstmrNm; //사업장명
    private String beginDe; //고용유지조치시작일
    private String endDe; //고용유지조치종료일
    private String empmntSpResnCd; //특정현안고용유지사유코드
    private String spcfPnprEmmcDtalRscd; //특정현안고용유지상세사유코드
    private String reqstYm; //신고연월
    private String stdrPdTotWorkhr; //기준기간총근로시간
    private String empmntManagtPdTotWorkhr; //고용유지조치기간총근로시간
    private String shrtenWorkhr; //단축근로시간
    private String ttmtSssDyct; //당월휴업일수
    private String tmpCno; //고객번호
    private String empmntSmDyct; //월별휴업일수
    private String totWorkHr; //월별휴업시간
    private String wagePymntAm; //휴업수당액
    private String sprmnyAm; //지급결정액

    @Builder
    public Ips(Long id, String bplcCno, String bplcIdntfcNo, String cstmrNm, String beginDe, String endDe, String empmntSpResnCd, String spcfPnprEmmcDtalRscd, String reqstYm, String stdrPdTotWorkhr, String empmntManagtPdTotWorkhr, String shrtenWorkhr, String ttmtSssDyct, String tmpCno, String empmntSmDyct, String totWorkHr, String wagePymntAm, String sprmnyAm) {
        this.id = id;
        this.bplcCno = bplcCno;
        this.bplcIdntfcNo = bplcIdntfcNo;
        this.cstmrNm = cstmrNm;
        this.beginDe = beginDe;
        this.endDe = endDe;
        this.empmntSpResnCd = empmntSpResnCd;
        this.spcfPnprEmmcDtalRscd = spcfPnprEmmcDtalRscd;
        this.reqstYm = reqstYm;
        this.stdrPdTotWorkhr = stdrPdTotWorkhr;
        this.empmntManagtPdTotWorkhr = empmntManagtPdTotWorkhr;
        this.shrtenWorkhr = shrtenWorkhr;
        this.ttmtSssDyct = ttmtSssDyct;
        this.tmpCno = tmpCno;
        this.empmntSmDyct = empmntSmDyct;
        this.totWorkHr = totWorkHr;
        this.wagePymntAm = wagePymntAm;
        this.sprmnyAm = sprmnyAm;
    }

    public Ips() {
        this.id = 0L;
        this.bplcCno = "";
        this.bplcIdntfcNo = "";
        this.cstmrNm = "";
        this.beginDe = "";
        this.endDe = "";
        this.empmntSpResnCd = "";
        this.spcfPnprEmmcDtalRscd = "";
        this.reqstYm = "";
        this.stdrPdTotWorkhr = "";
        this.empmntManagtPdTotWorkhr = "";
        this.shrtenWorkhr = "";
        this.ttmtSssDyct = "";
        this.tmpCno = "";
        this.empmntSmDyct = "";
        this.totWorkHr = "";
        this.wagePymntAm = "";
        this.sprmnyAm = "";
    }
}
