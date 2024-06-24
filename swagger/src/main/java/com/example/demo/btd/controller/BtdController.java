package com.example.demo.btd.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.btd.dto.BtdDTO;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BtdController {
	
	//Basic terminology dictionary 기본 용어 사전
	//채번 creBtd
	
	
	
	//조회 inqBtd
	
	//생성 regBtd
	@PostMapping("/btd/regBtd")
	public String creBtd(@RequestBody List<BtdDTO.BtdReqDTO> btdReqDTO) {
		System.out.println("btdReqDTO :::" + btdReqDTO);
		return null;
	}
	
	
	//수정 modBtd
	
	//삭제 delBtd
	
}
