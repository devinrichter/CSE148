package p1_gridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class DemoGridPane extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField ft1 = new TextField();
		TextField ft2 = new TextField();
		TextField ft3 = new TextField();
		TextField ft4 = new TextField();
		
		Button bt1 = new Button("BTN1");
		Button bt2 = new Button("BTN2");
		Button bt3 = new Button("BTN3");
		Button bt4 = new Button("BTN4");
		
		bt1.setPrefWidth(200);
		bt2.setPrefWidth(200);
		bt3.setPrefWidth(200);
		bt4.setPrefWidth(200);
		
		
		TextArea ta = new TextArea();
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(100));
		gridPane.setVgap(50);
		gridPane.setHgap(50);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.autosize();
		
//		 ColumnConstraints column1 = new ColumnConstraints(100,100,Double.MAX_VALUE);
//	     column1.setHgrow(Priority.ALWAYS);
//	     ColumnConstraints column2 = new ColumnConstraints(100);
//	     gridpane.getColumnConstraints().addAll(column1, column2); // first column gets any extra width
		
		gridPane.add(ft1, 0, 0);
		gridPane.add(ft2, 1, 0);
		gridPane.add(ft3, 2, 0);
		gridPane.add(ft4, 3, 0);
		
		gridPane.add(bt1, 0, 1);
		gridPane.add(bt2, 1, 1);
		gridPane.add(bt3, 2, 1);
		gridPane.add(bt4, 3, 1);
		
		gridPane.add(ta, 1, 2, 2, 3); 
		
		BorderPane root = new BorderPane();
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		Menu helpMenu = new Menu("Help");
		
		MenuItem exitItem = new MenuItem("Exit");
		fileMenu.getItems().add(exitItem);
		
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
		
		root.setTop(menuBar);
		root.setCenter(gridPane);
		
		Scene scene = new Scene(root, 900, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	

}
