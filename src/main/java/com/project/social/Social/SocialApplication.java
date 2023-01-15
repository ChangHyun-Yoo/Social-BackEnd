package com.project.social.Social;

import com.project.social.member.MemberDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SocialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialApplication.class, args);
	}

	@GetMapping(value = "/")
	public MemberDto HelloWorld() {

		MemberDto memberDto = new MemberDto();
		memberDto.setId("jakey1110");
		memberDto.setPw("1417yoo");
		return memberDto;
	}
}
