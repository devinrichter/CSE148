package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.UserBag;

public class SignInPane {
	
	private Pane root;
	
	public SignInPane(UserBag userBag, Stage primaryStage) {
		VBox box1 = new VBox(30);
		box1.setAlignment(Pos.CENTER);
		
		TextField usernameField = new TextField();
		usernameField.setPromptText("USERNAME");
		usernameField.setMaxSize(200, 20);
		
		PasswordField passwordField = new PasswordField();
		passwordField.setPromptText("PASSWORD");
		passwordField.setMaxSize(200, 20);
		
		box1.getChildren().addAll(usernameField, passwordField);
		
		
		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		
		Button signInBtn = new Button("SIGN IN");
		Button signUpBtn = new Button("SIGN UP");
		
		btnBox.getChildren().addAll(signInBtn, signUpBtn);
		
		HBox lblBox = new HBox(30);
		lblBox.setAlignment(Pos.CENTER);
		Label msgLbl = new Label();
		lblBox.getChildren().add(msgLbl);
		
		root = new VBox(30);
		root.getChildren().addAll(box1, btnBox, lblBox);
		Insets insets = new Insets(100, 0, 0, 0);
		root.setPadding(insets);
		
		signInBtn.setOnAction(e -> {
			String username = usernameField.getText();
			String password = passwordField.getText();
			if(userBag.isSignedIn(username, password)) {
				msgLbl.setText("Sign in Success!");
				// should then go to another pane (e.g., explore trails pane)
			} else {
//				msgLbl.setText("Sign in failure.");
				usernameField.clear();
				passwordField.clear();
				msgLbl.setText("Incorrect username or password. Try again!");
			}
		});
		
		signUpBtn.setOnAction(e -> {
//			System.out.println("Show the sign up pane!");
			this.root = new SignUpPane(userBag, primaryStage).getRoot();
			primaryStage.getScene().setRoot(root);
		});
		
		
	}

	public Pane getRoot() {
		return root;
	}
}
