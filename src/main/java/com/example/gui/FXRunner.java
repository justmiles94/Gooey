package com.example.gui;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class FXRunner extends Application {

	public static void main(String[] args) {
		System.out.println("FX");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Creating a Text object
		Text text = new Text();

		// Setting font to the text
		text.setFont(new Font(45));

		// setting the position of the text
		text.setX(50);
		text.setY(150);

		// Setting the text to be added.
		text.setText("Welcome to Justin's GUI");

		// Creating a Group object
		Group root = new Group();

		// Retrieving the observable list object
		ObservableList<Node> list = root.getChildren();

		// Setting the text object as a node to the group object
		list.add(text);
		Scene scene = new Scene(root, 800, 300);
		scene.setFill(Color.BROWN);
		primaryStage.setTitle("myTitle");
		primaryStage.setScene(scene);
		moveStage(primaryStage);
		primaryStage.show();
	}
	
	public void moveStage(Stage stage) {
		Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
		stage.xProperty().addListener((obs, oldVal, newVal) -> {
			if(newVal.intValue() < 50 && 0 != newVal.intValue() && oldVal.intValue() != 0) {
				stage.setX(0);
			}else if(newVal.intValue() > screenBounds.getWidth() - 50 && newVal.doubleValue() != screenBounds.getWidth() && oldVal.doubleValue() != screenBounds.getWidth()) {
				stage.setX(screenBounds.getWidth());
			}
			System.out.println("X: " + newVal);
			System.out.println("Screen X: " + screenBounds.getWidth());
			System.out.println();
		});
		stage.yProperty().addListener((obs, oldVal, newVal) -> {
			if(newVal.intValue() < 50 && 0 != newVal.intValue() && oldVal.intValue() != 0) {
				stage.setY(0);
			}else if(newVal.intValue() > screenBounds.getHeight() - 50 && newVal.doubleValue() != screenBounds.getHeight() && oldVal.doubleValue() != screenBounds.getHeight()) {
				stage.setY(screenBounds.getHeight());
			}
			System.out.println("Y: " + newVal);
			System.out.println("Screen Y: " + screenBounds.getHeight());
			System.out.println();
		});
	}

}
