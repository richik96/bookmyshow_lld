package com.example.bookmyshow23.bookmyshow_lld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.bookmyshow23.bookmyshow_lld.models.BaseModel;
//import com.example.bookmyshow23.bookmyshow_lld.models.Screen;

@SpringBootApplication
public class BookmyshowLldApplication {

	public static void main(String[] args) {
		BaseModel baseModel = new BaseModel();
		//baseModel.setCreatedAt(null);
		//Screen screen = new Screen();
		SpringApplication.run(BookmyshowLldApplication.class, args);
	}

}
