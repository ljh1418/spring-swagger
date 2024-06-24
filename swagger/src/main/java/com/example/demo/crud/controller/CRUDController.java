package com.example.demo.crud.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.util.SystemInfo;


@RestController
public class CRUDController {
	
	// 리스트 페이지이동
	@GetMapping("/crud/listPage")
	public ModelAndView crudListPage() {
		System.out.println("crudListPage() >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crud/list");
		return mav;
	}
	
	// 인서트 페이지이동
	@GetMapping("/crud/insertPage")
	public ModelAndView crudInsertPage() {
		System.out.println("crudInsertPage() >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crud/insert");
		return mav;
	}
	
	// 상세 페이지이동
	@GetMapping("/crud/detailPage")
	public ModelAndView crudDetailPage() {
		System.out.println("crudDetailPage() >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("crud/detail");
		return mav;
	}
	

}
