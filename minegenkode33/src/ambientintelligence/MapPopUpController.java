package ambientintelligence;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MapPopUpController implements Initializable {

	@FXML
	private Button button2;

	@FXML
	private Label labelmex;
	
	@FXML
	private ImageView mexicanPic;
	
	@FXML
	private ImageView gelatoPic;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	@FXML
	public void getBackMobile(ActionEvent event) throws Exception {
		Parent view3 = FXMLLoader.load(getClass().getResource("ViewMobil.fxml"));
		Scene scene3 = new Scene(view3);
				
		Stage window3 = (Stage)((Node)event.getSource()).getScene().getWindow();
		window3.hide();
		window3.setScene(scene3);
		window3.show();
	}
	@FXML
	public void getMexicanDiscount() {
		mexicanPic.setVisible(true);
	}
	@FXML
	public void removeMexicanDiscount() {
		mexicanPic.setVisible(false);
	}
	@FXML
	public void getGelatoEvent() {
		gelatoPic.setVisible(true);
	}
	@FXML
	public void removeGelatoEvent() {
		gelatoPic.setVisible(false);
	}
}
