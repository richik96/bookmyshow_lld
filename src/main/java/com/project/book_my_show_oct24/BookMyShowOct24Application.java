package com.project.book_my_show_oct24;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.project.book_my_show_oct24.Controllers.UserController;
import com.project.book_my_show_oct24.dtos.SignUpRequestDto;
import com.project.book_my_show_oct24.dtos.SignUpResponseDto;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowOct24Application implements CommandLineRunner{

	UserController userController;
	public static void main(String[] args) {
		
		SpringApplication.run(BookMyShowOct24Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		SignUpRequestDto signUpRequestDto = new SignUpRequestDto();
		signUpRequestDto.setEmail("drichik@gamil.com");
		signUpRequestDto.setName("Richik");
		signUpRequestDto.setPassword("1234");
		SignUpResponseDto responseDto= userController.signUp(signUpRequestDto);
	}

}
