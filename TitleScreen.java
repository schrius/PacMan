package Pac;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TitleScreen extends Application{
	Stage window;
	@Override
	public void start(Stage stage) throws Exception {
		
		window = stage;
		window.setOnCloseRequest(e -> closeProgram());
		// Resource must be in the same directory or change to a corresponding directory.
		Parent parent = FXMLLoader.load(getClass().getResource("FXGradeGuy.fxml"));
		
		Scene scene = new Scene(parent);
		
		window.setTitle("Grade Guy");
		window.setScene(scene);
		window.show();
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void closeProgram(){
		window.close();
	}
	
}
