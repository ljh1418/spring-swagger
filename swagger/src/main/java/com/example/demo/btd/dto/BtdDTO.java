package com.example.demo.btd.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter	
@Setter
@ToString
public class BtdDTO {
	
	@Getter	
	@Setter
	@ToString
	public static class BtdReqDTO {//extends tbCosm0001{
		
		//'용어구분코드'
		private String termId = "";
		
		//'용어구분코드'
		private String termDvCd = "";
		
		//'한글단어명'
		private String hnglWdnm = "";
		
		//'SYNO'
		private String syno = "";
		
		//'약어'
		private String acronym = "";
		
		//'전체명'
		private String fullNm = "";
		
		//'데이터크기',
		private String dataSize = "";
		
		//'데이터타입코드',
		private String dataTypeCd = "";
		
		//'설명',
		private String dscr = "";
		
		//'신청여부',
		private String applYn = "";
		
		//'삭제여부',
		private String delYn = "";
		
		//'등록일시',
		private String regDttm = "";
		
		//'등록사원번호',
		private String regEmpNo = "";
		
		//'수정프로그램ID',
		private String modPgmId = "";
		
		//'수정일시',
		private String modDttm = "";
		
		//'수정사원번호',
		private String modEmpNo = "";

		public BtdReqDTO() {
        }

		
	}
	
	
}
