package p1;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class DemoAlerts extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void init() {
		// restore bags from binary files
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
//		Alert alert1 = new Alert(AlertType.ERROR);
//		alert1.setTitle("Error!");
//		alert1.setHeaderText("Watch, there is an error!");
//		alert1.setContentText("This is an error due to a typo");
//		alert1.showAndWait();
		
//		Alert alert2 = new Alert(AlertType.WARNING);
//		alert2.setTitle("Warning!");
//		alert2.setHeaderText("Watch, there is a warning!");
//		alert2.setContentText("This is a warning alert");
//		alert2.showAndWait();
		
//		Alert alert3 = new Alert(AlertType.INFORMATION);
//		alert3.setTitle("Information!");
//		alert3.setHeaderText("For your information!");
//		alert3.setContentText("This is an information alert");
//		alert3.showAndWait();
		
		TextInputDialog dialog = new TextInputDialog("GPA");
		dialog.setTitle("Enter a correct GPA value");
//		dialog.setHeaderText("A correct GPA value is needed");
		dialog.setContentText("Pleases enter a correct GPA value");
		
		Optional<String> result = dialog.showAndWait();
		if(result.isPresent()) {
			String gpaStr = result.get();
			double gpa = Double.parseDouble(gpaStr);
			System.out.println("The GPA entered is: " + gpa);
		}
				
	}

}
