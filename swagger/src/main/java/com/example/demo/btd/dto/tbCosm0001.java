package com.example.demo.btd.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * 게시물에 대한 데이터 처리 모델 클래스
 * @author 공통 서비스 개발팀 이삼섭
 * @since 2009.03.06
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자          수정내용
 *  -------    --------    ---------------------------
 *  2009.03.06  이삼섭          최초 생성
 *  2011.08.31  JJY            경량환경 템플릿 커스터마이징버전 생성
 *
 *  </pre>
 */
@Schema(description = "기본용어사전 모델")
@Getter
@Setter
public class tbCosm0001 implements Serializable {

	/**
	 *  serialVersion UID
	 */
	private static final long serialVersionUID = 8700643082453699735L;

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
	/**
	 * toString 메소드를 대치한다.
	 */
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
