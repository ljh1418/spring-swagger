package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.User;
import com.example.demo.service.BeanService;
import com.example.demo.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@Tag(name = "컨트롤러 이름", description = "컨트롤러 설명") //컨트롤러 클래스 설명
@RequiredArgsConstructor // lombok으로 스프링에 의존성 주입 초기화 되지않은 final필드나, @Notnull이 붙은 필드에 대해 생성자를 생성
@RestController
public class UserController {
	
	private final UserService userService;
	
	@Operation(summary ="메인페이지", description  ="메인페이지 이동") // @Operation:함수설명 어노테이션
	@GetMapping("/main")
	public ModelAndView mainPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
	}
	
	@Operation(summary ="유저조회", description  ="id값으로 유저를 조회") // @Operation:함수설명 어노테이션
	@GetMapping("/user/{id}")
	public ModelAndView userSelect(@PathVariable("id") String id) {
		
		User userSelect = userService.userSelect(id);
		System.out.println("userSelect ::: " + userSelect);
		ModelAndView mav = new ModelAndView();
		mav.addObject("userSelect",userSelect);
		mav.setViewName("main");
		
		return mav;
	}
	
	//에이작스 호출 url
	@GetMapping("/user/list")
	public List<User> usetList(){
		return userService.userList();
	}
	
	@GetMapping("/user/test")
	public String userTest() {
		return "1";
	}
	
	@Autowired
	private BeanService beanService;
	
	public void controllerBeanMessage() {
		System.out.println(beanService.beanMessage());
	}
	
//	
//	@GetMapping("/user/all")
//	@Operation(summary ="유저 전체 조회", description  ="모든 유저를 조회")
//	public List<UserProfile> getUserProfileList() {
//		return mapper.getUserProfileList();
//	}
//	
//	@PutMapping("/user/{id}")
//	@Operation(summary ="유저 등록", description  ="id값으로 유저를 등록")
//	public void putUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
//		mapper.insertUserProfile(id, name, phone, address);
//	}
//	
//	@PostMapping("/user/{id}")
//	@Operation(summary ="유저 업데이트", description  ="id값의 유저를 업데이트")
//	public void postUserProfile(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
//		mapper.updateUserProfile(id, name, phone, address);
//	}
//	
//	
//	@DeleteMapping("/user/{id}")
//	@Operation(summary ="유저 삭제", description  ="id값의 유저를 삭제")
//	public void deleteUserProfile(@PathVariable("id") String id) {
//		System.out.println("DELETE deleteUserProfile id ::: " + id);
//		mapper.deleteUserProfile(id);
//	}
}