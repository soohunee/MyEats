package com.myeats.myeats;

import com.myeats.myeats.Service.SearchService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyeatsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyeatsApplication.class, args);
		SearchService searchService = new SearchService();
		searchService.searchRestaurant("할매순대국");
	}

}
