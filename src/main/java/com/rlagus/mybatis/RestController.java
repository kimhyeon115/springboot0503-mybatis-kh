package com.rlagus.mybatis;

import org.springframework.web.bind.annotation.RequestMapping;

import com.rlagus.mybatis.dto.MemberDto;

@org.springframework.web.bind.annotation.RestController		// @Controller와의 차이
public class RestController {
	
	@RequestMapping(value = "/test")
	public String test() {
		return "welcome test";								// 문자열을 웹페이지에 바로 출력
	}

	@RequestMapping(value = "/member")
	public MemberDto member() {
		
		MemberDto dto = new MemberDto();
		dto.setName("홍길동");
		dto.setId("rlagus");
		dto.setPw("1234");
		dto.setAge(99);
		
		return dto;
	}
}
