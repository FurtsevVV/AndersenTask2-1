package com.zakat.andersencourse.andersentask2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

@SpringBootApplication
@RestController
public class Andersentask2Application {

	public static void main(String[] args) {
		SpringApplication.run(Andersentask2Application.class, args);



	}


	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name1) {
		return String.format("Hello %s!", name1);}

}
