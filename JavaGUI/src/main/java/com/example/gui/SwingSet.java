package com.example.gui;

import java.awt.GraphicsEnvironment;
import java.io.Console;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwingSet implements CommandLineRunner{

	Map<String, String> questionAnswer = new LinkedHashMap<String, String>();
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SwingSet.class);
	}

	@Override
	public void run(String... args) throws Exception {
		if(GraphicsEnvironment.isHeadless()) {
			commandInterface(args);
		}else {
			guiInterface(args);
		}
	}
	
	public void commandInterface(String ...args) {
		Console console = System.console();
		questionAnswer.keySet().forEach(question -> {
			questionAnswer.put(question, console.readLine(question));
		});
	}
	
	public void guiInterface(String ...args) {
		
	}

}
