package p1;

import java.util.Optional;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignUpView {
	private VBox root;
	private UserBag userBag;

	public SignUpView(UserBag userBag, Stage primaryStage) {
		this.userBag = userBag;
		TextField userNameField = new TextField();
		userNameField.setPromptText("USERNAME");
		
		PasswordField passwordField1 = new PasswordField();
		passwordField1.setPromptText("PASSWORD");
		PasswordField passwordField2 = new PasswordField();
		passwordField2.setPromptText("PASSWORD");
		
		Button signUpBtn = new Button("SIGN UP");
		Button signInBtn = new Button("SIGN IN");
		
		signUpBtn.setOnAction(e -> {
			User user = new User(userNameField.getText(), passwordField1.getText());
			userBag.insert(user);
			userNameField.clear();
			passwordField1.clear();
			passwordField2.clear();
		});
		
		signInBtn.setOnAction(e -> {
			this.root = new SignInView(userBag, primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		
		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(signUpBtn, signInBtn);
		
//		signUpBtn.setOnAction(e -> {
//			if(passwordField1.getText().equals(passwordField2.getText())) {
//				Alert alert1 = new Alert(AlertType.INFORMATION);
//				alert1.setTitle("INFORMATION");
//				alert1.setHeaderText("Good job, the two passwords match!");
//				alert1.setContentText("Passwords entered are the same");
//				alert1.showAndWait();
//			} else {
//				Alert alert2 = new Alert(AlertType.ERROR);
//				alert2.setTitle("ERROR");
//				alert2.setHeaderText("The two passwords don't match!");
//				alert2.setContentText("Passwords entered are not the same.");
//				alert2.showAndWait();
//			}
//		});
		
//		signUpBtn.setOnAction( e -> {
//			
//			if(userNameField.getText().equals("")) {
//				TextInputDialog dialog = new TextInputDialog();
//				dialog.setTitle("Username Missing!");
//				dialog.setHeaderText("No username entered");
//				dialog.setContentText("Please enter your username: ");
//				Optional<String> result = dialog.showAndWait();
//				if(result.isPresent()) {
//					System.out.println("The username entered is: " + result.get());
//				}
//			}
//		});
		
		root = new VBox(30);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(userNameField, passwordField1, passwordField2, btnBox);
	}
	
	public VBox getRoot() {
		return root;
	}
}
