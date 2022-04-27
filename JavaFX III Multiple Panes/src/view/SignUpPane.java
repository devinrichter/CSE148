package view;



import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.User;
import model.UserBag;

public class SignUpPane {
	
	private Pane root; 
	
	public SignUpPane(UserBag userBag, Stage primaryStage) {
		HBox nameBox = new HBox(20);
		nameBox.setAlignment(Pos.CENTER);
		
		TextField firstNameField = new TextField();
		TextField lastNameField = new TextField();
		
		firstNameField.setMaxSize(200, 20);
		firstNameField.setPromptText("First Name");
		lastNameField.setMaxSize(200, 20);
		lastNameField.setPromptText("Last Name");
		
		nameBox.getChildren().addAll(firstNameField, lastNameField);
		
		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		
		Button okBtn = new Button("OK");
		Button exitBtn = new Button("EXIT");
		
		okBtn.setPrefSize(70, 20);
		exitBtn.setPrefSize(70, 20);
		
		btnBox.getChildren().addAll(okBtn, exitBtn);
		
		Pane root = new VBox(30);
		root.setPadding(new Insets(200));
		root.getChildren().addAll(nameBox, btnBox);
		this.root = root;
		
		
		okBtn.setOnAction(e -> {
			String firstName = firstNameField.getText();
			String lastName = lastNameField.getText();
//			User user = new User(firstName, lastName);
//			userBag.insert(user);
			System.out.print("Captured " + firstName);
			System.out.println(" " + lastName);
			this.root = new SignInPane(userBag, primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		
		exitBtn.setOnAction(e -> {
			Platform.exit();
		});
		
	}
	
	public Pane getRoot() {
		return root;
	}
	
}
