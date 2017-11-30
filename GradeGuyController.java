package Pac;
//any change to the package name must also change the controller path in the FXML file.
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GradeGuyController {
	
	//Controller variable must the same as the ones declared in FX GUI file.
	@FXML
	private Button StartButton;
	
	@FXML
	private Button HighScoreButton;
	
	@FXML
	private Button CreditButton;
	
	@FXML
	private Button ExitButton;
	
	@FXML
	private Label TitleLabel;
	
	// These four label are not intended to be changed.
	@FXML
	private Label A;
	@FXML
	private Label S;
	@FXML
	private Label D;
	@FXML
	private Label W;
	@FXML
	private Label Ver;
	
	//listener for button on the title screen
	public void StartButtonListener(){
		
	}
	
	public void HighScoreButtonListener(){
		
	}
	
	public void CreditButtonListener(){
		
	}
	
	public void ExitButtonListener(){
		Stage stage = (Stage)ExitButton.getScene().getWindow();
		stage.close();
	}
}
