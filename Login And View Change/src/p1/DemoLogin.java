package p1;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoLogin extends Application {
	private UserBag userBag;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() {
		System.out.println("hi from init method");
		// restore userBag
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		userBag = new UserBag(100);
		VBox root = new SignInView(userBag, primaryStage).getRoot();
		
		Scene scene = new Scene(root, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(e -> {
			// backup userBag
		});
		primaryStage.show();
		
	}

}
