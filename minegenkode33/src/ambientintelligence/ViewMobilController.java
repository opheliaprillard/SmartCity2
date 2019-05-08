package ambientintelligence;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class ViewMobilController implements Initializable {

	@FXML
	private Button testback;
	@FXML
	private Button secondMap;
	@FXML
	private ChoiceBox foods;
	@FXML
	private ChoiceBox film;
	@FXML
	private ChoiceBox bars;
	@FXML
	private ChoiceBox shops;
	@FXML
	private ChoiceBox activities;
	

	@FXML
	public void changeBack(ActionEvent event) throws Exception {
		Parent view1 = FXMLLoader.load(getClass().getResource("Fxtryout.fxml"));
		Scene scene1 = new Scene(view1);
				
		Stage window1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		window1.hide();
		window1.setScene(scene1);
		window1.show();
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
	@FXML
	public void changeSecondMap(ActionEvent event) throws Exception {
		Parent view2 = FXMLLoader.load(getClass().getResource("MapPopUp.fxml"));
		Scene scene2 = new Scene(view2);
		
		Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
		window2.hide();
		window2.setScene(scene2);
		window2.show();
	}

}
