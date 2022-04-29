package p1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SignInView {
	private UserBag userBag;
	private VBox root;
	private TextField usernameField;
	private PasswordField passwordField;
	
	public SignInView(UserBag userBag, Stage primaryStage) {
		this.userBag = userBag;
		usernameField = new TextField();
		usernameField.setPromptText("USERNAME");
		
		passwordField = new PasswordField();
		passwordField.setPromptText("PASSWORD");
		
		Button signInBtn = new Button("SIGN IN");
		
		signInBtn.setOnAction(e -> {
			if(userBag.searchByUsernameAndPassword(usernameField.getText(), passwordField.getText())) {
				System.out.println("User signed in!");
				clearFields();
			} else {
				System.out.println("Incorrect username or password!");
				clearFields();
			}
		});
		
		
		Button signUpBtn = new Button("SIGN UP");
		signUpBtn.setOnAction(e -> {
			this.root = new SignUpView(userBag, primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		
		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(signInBtn, signUpBtn);
		
		root = new VBox(30);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(usernameField, passwordField, btnBox);
		
	}
	
	public void clearFields() {
		usernameField.clear();
		passwordField.clear();
	}
	public VBox getRoot() {
		return root;
	}

}
