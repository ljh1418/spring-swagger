package com.example.demo.toast.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ToastController {
	
	@GetMapping("/toast/test")
	public ModelAndView toastPage() {
		System.out.println("toastPage() >>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/toast/toastTest");
		return mav;
	}
	
	//체크박스
	@GetMapping("/toast/checkbox")
	public ModelAndView toastcheckbox() {
		System.out.println("toastPage() >>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/toast/toastTestCheckbox");
		return mav;
	}
	
	@GetMapping("/toast/excelUpload")
	public ModelAndView toastPage1() {
		System.out.println("toastPage1() >>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/toast/excelUpload");
		return mav;
	}
	
	@GetMapping("/toast/editor")
	public ModelAndView toastEditor() {
		System.out.println("toastEditor() >>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/toast/editorOption");
		return mav;
	}
	
	
	@GetMapping("/toast/option")
	public ModelAndView toastOption() {
		System.out.println("toastOption() >>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/toast/toastOption");
		return mav;
	}
	
	//셀렉트박스
	@GetMapping("/toast/selectBox")
	public ModelAndView selectBox() {
		System.out.println("selectBox() >>>>>>>>>>>>>>>>");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/toast/toastSelectBox");
		return mav;
	}	

	
	
}
