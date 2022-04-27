package app;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class DemoAlerts extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		Alert alert1 = new Alert(AlertType.WARNING);
		alert1.setTitle("Warning!");
		alert1.setHeaderText("Be careful");
		alert1.setContentText("The password entered does not match");
		alert1.show();
		
	}

}
