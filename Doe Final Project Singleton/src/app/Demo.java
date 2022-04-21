package app;

import javafx.scene.layout.VBox;
import model.PersonBag;
import util.Restore;
import view.PersonView;

public class Demo {

	public static void main(String[] args) {		
		
		PersonBag personBag = Restore.restorePersonBag();
		PersonView personView = new PersonView(personBag);
		VBox root = personView.getRoot();
		
		Scene scene = new Scene(root, 800, 500);
		
		
		
	}

}
