package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.chapter03.used.Greet;

@SpringBootApplication
public class DemoApplication {
	/**
	 * main 메서드
	 */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
				.getBean(DemoApplication.class).execute();
	}
	/**
	 * 주입 하는곳 (Interface)
	 */
	@Autowired
	Greet greet;

	private void execute() {
		greet.greeting();
	}

}
