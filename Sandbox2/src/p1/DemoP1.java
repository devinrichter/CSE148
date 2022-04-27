package p1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoP1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox topBox = new VBox(30);
		topBox.setAlignment(Pos.CENTER);
		Label outLabel = new Label();
		TextField inputField = new TextField();
		inputField.setMaxWidth(200);
		Button okBtn = new Button("OK");
		okBtn.setOnAction(e -> {
			String str = inputField.getText();
			double gpa = Double.parseDouble(str);
			if (gpa < 0.0 || gpa > 4.0) {
				try {
					throw new IncorrectGPAException("Incorrect GPA");
				} catch (Exception ev) {
						inputField.clear();
						outLabel.setText("The GPA is incorrect. Enter again.");
				}
			} else {
				inputField.clear();
				outLabel.setText(String.valueOf(gpa));
			}
		});
		topBox.getChildren().addAll(outLabel, inputField, okBtn);
		Scene scene = new Scene(topBox, 500, 300);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
