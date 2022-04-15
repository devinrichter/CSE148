package app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Demo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button insertBtn = new Button("INSERT");
		insertBtn.setPrefSize(100, 30);
		
		
		
		Button searchBtn = new Button("SEARCH");
		searchBtn.setPrefSize(100, 30);
		Button updateBtn = new Button("UPDATE");
		updateBtn.setPrefSize(100, 30);
		Button removeBtn = new Button("REMOVE");
		removeBtn.setPrefSize(100, 30);
		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(insertBtn, searchBtn, updateBtn, removeBtn);
		
		HBox inputBox = new HBox(20);
		inputBox.setAlignment(Pos.CENTER);
		
		TextField nameField = new TextField();
		nameField.setPromptText("Name");
		nameField.setPrefSize(150, 30);
		TextField gpaField = new TextField();
		gpaField.setPrefSize(150, 30);
		gpaField.setPromptText("GPA");
		
		VBox outputBox = new VBox(20);
		outputBox.setAlignment(Pos.CENTER);
		TextField outputField = new TextField();
		outputField.setMaxSize(300, 30);
		TextArea outputArea = new TextArea();
		outputArea.setMaxSize(600, 300);
		
		outputBox.getChildren().addAll(outputField, outputArea);
		
		insertBtn.setOnAction(e -> {
			String name = nameField.getText();
			double gpa = Double.parseDouble(gpaField.getText());
			nameField.clear();
			gpaField.clear();
			outputField.setText("This is what you entered: ");
			outputArea.appendText("Hey, " + name + ", your curved GPA is " + (gpa + 0.5) + ".\n");
		});
			
		
		inputBox.getChildren().addAll(nameField, gpaField);
		
		VBox root = new VBox(50);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(inputBox, btnBox, outputBox);
		
		
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("First Window");
		primaryStage.show();
	}

}
