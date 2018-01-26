package com.example.gui;

import org.springframework.beans.factory.annotation.Value;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlRunner extends Application {
	
	@Value("${fxml.file:}")
	private static String fxmlFile;

	public static void main(String[] args) {
		System.out.println("fxml");
		fxmlFile = args[0];
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setFullScreen(true);
		primaryStage.show();
	}

}
