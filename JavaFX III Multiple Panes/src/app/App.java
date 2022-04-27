package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.TrailBag;
import model.UserBag;
import utils.BackupAndRestore;
import view.SignInPane;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		UserBag userBag = new UserBag(1000);
		TrailBag trailBag = new TrailBag(500);
		
		BackupAndRestore.restoreAll(userBag, trailBag);
		
		Pane root  = new SignInPane(userBag, primaryStage).getRoot();
	
		
		Scene scene = new Scene(root, 800, 500);
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(e -> {
			BackupAndRestore.backupUsers(userBag);
		});
		primaryStage.show();
	}

}
