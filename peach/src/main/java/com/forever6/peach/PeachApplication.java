package com.forever6.peach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// Spring Security 미개발로 인한 예외처리
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@SpringBootApplication // 정상 코드
public class PeachApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeachApplication.class, args);
	}

}
