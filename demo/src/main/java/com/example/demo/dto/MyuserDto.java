package com.example.demo.dto;

import lombok.Data;

@Data
public class MyuserDto {
	private String EMP_NO;
	private String BR_CD;
	private String EMP_NM;
	private String EMP_JBLVL_CD;
	private String POSI_CD;
	
	public String getEMP_NO() {
		return EMP_NO;
	}
	public void setEMP_NO(String eMP_NO) {
		EMP_NO = eMP_NO;
	}
	public String getBR_CD() {
		return BR_CD;
	}
	public void setBR_CD(String bR_CD) {
		BR_CD = bR_CD;
	}
	public String getEMP_NM() {
		return EMP_NM;
	}
	public void setEMP_NM(String eMP_NM) {
		EMP_NM = eMP_NM;
	}
	public String getEMP_JBLVL_CD() {
		return EMP_JBLVL_CD;
	}
	public void setEMP_JBLVL_CD(String eMP_JBLVL_CD) {
		EMP_JBLVL_CD = eMP_JBLVL_CD;
	}
	public String getPOSI_CD() {
		return POSI_CD;
	}
	public void setPOSI_CD(String pOSI_CD) {
		POSI_CD = pOSI_CD;
	}
}
