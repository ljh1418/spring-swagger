package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
// import org.springframework.data.repository.query.Param; 주의
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM UserProfile WHERE id=#{id}")
	User userSelect(@Param("id") String id);
	
	@Select("SELECT * FROM UserProfile")
	List<User> usetList();
	
//	@Select("SELECT * FROM UserProfile WHERE id=#{id}")
//	User userSelect(String id);

	
//	@Select("SELECT * FROM UserProfile")
//	List<UserProfile> getUserProfileList();
//	
//	@Insert("INSERT INTO UserProfile VALUES(#{id}, #{name}, #{phone}, #{address})")
//	int insertUserProfile(@Param("id") String id, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);
//
//	@Update("UPDATE UserProfile SET name=#{name}, phone=#{phone}, address=#{address} WHERE id=#{id}")
//	int updateUserProfile(@Param("id") String id, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);
//
//	@Delete("DELETE FROM UserProfile WHERE id=#{id}")
//	int deleteUserProfile(@Param("id") String id);
}