package com.example.demo.dto;

import lombok.Data;

//@Data // toString, getter, setter 메소드 생성
//@NoArgsConstructor // 파라미터가 없는 기본 생성자를 생성
//@AllArgsConstructor //모든 필드 값을 파라미터로 받는 생성자 생성
//@RequiredArgsConstructor //final이나 @NonNull인 필드 값만 파라미터로 받는 생성자 생성
@Data
public class User {
	private String id;
	private String name;
	private String phone;
	private String address;
}