package com.example.gui;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GooeyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		System.out.println("Gooey");
		SpringApplication.run(GooeyApplication.class, args);
	}

	public void run(String... args) throws Exception {
		FXRunner.main(args);
	}
}
