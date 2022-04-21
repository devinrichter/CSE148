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
		PersonBag personBag = Restore.restorePersonBag();
		PersonView personView = new PesonView(personBag);
		
		
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("First Window");
		primaryStage.show();
	}

}
