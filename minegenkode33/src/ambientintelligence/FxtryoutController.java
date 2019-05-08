package ambientintelligence;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FxtryoutController implements Initializable{

	@FXML
	private Button button1;
	@FXML
	private Button button11;
	@FXML
	private Button button12;
	@FXML
	private Button button14;
	@FXML
	private Button button15;
	@FXML
	private Button button16;
	@FXML
	private Button button17;
	@FXML
	private Button button18;
	@FXML
	private Button button13;
	@FXML
	private Label changelabel;
	@FXML
	private Button startDay;
	@FXML
	private AnchorPane ancP;
	
	//pressing button getting the people?
	
	//public void getAnim(Animationtryout anim) {
		//this.anim = anim;
	//}
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		Duration duration = Duration.millis(2500);
        TranslateTransition transition = new TranslateTransition(duration);
		transition.setNode(button1);
        transition.setToY(200);
        transition.setToX(100);
        transition.setAutoReverse(true);
        transition.setCycleCount(2);
        //transition.play();
        
        TranslateTransition transition1 = new TranslateTransition(duration);
		transition1.setNode(button11);
        transition1.setToY(200);
        transition1.setToX(100);
        transition1.setAutoReverse(true);
        transition1.setCycleCount(2);
        //transition.play();
        
        ScaleTransition scaling = new ScaleTransition(duration);
        scaling.setNode(button1);
        scaling.setByX(2f);
        scaling.setByY(2f);
        transition1.setAutoReverse(true);
        
        ParallelTransition seq1 = new ParallelTransition(transition1,scaling);
		seq1.play();
		
        
        //SequentialTransition sequentialtransition = new SequentialTransition(transition,scaling);
		//sequentialtransition.play();
		
	}
	public void changeScreen(ActionEvent event) throws Exception {
		Parent view2 = FXMLLoader.load(getClass().getResource("ViewMobil.fxml"));
		Scene scene2 = new Scene(view2);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.hide();
		window.setScene(scene2);
		window.show();
	}
	public void updateL() {
		changelabel.setText("15");
		
	}
	@FXML
	public void getImageView(ActionEvent event) {
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			ImageView iv1 = new ImageView(getClass().getResource("button.png").toExternalForm());
			iv1.setFitHeight(9);
			iv1.setFitWidth(9);
			int x = random.nextInt(750);
			int y = random.nextInt(750);
			iv1.setX(x);
			iv1.setY(y);
			Label labels = new Label(""+ i); //ta inn databasen
			labels.setGraphicTextGap(100);
			labels.setLabelFor(iv1);
			
			//labels.prefHeight(50);
			//labels.prefWidth(50);
			//hbox.setSpacing(100);
			//hbox.getChildren().add(labels);
			//iv1.setX(random.nextInt(750));
			//iv1.setY(random.nextInt(750));
		    ancP.getChildren().addAll(labels);
			
		}
		for (int i = 0; i < 50; i++) {
			ImageView iv = new ImageView(getClass().getResource("button.png").toExternalForm());
			iv.setX(1500 - random.nextInt(750));
			iv.setY(random.nextInt(550));
			iv.setFitHeight(9);
			iv.setFitWidth(9);
			ancP.getChildren().add(iv);
		}
	}
	
	/* button1.setOnAction(e -> window.setScene(scene2));
	 * Layout 1
	 * Vbox layout1 = new Vbox(20);
	 * layout1.getChildren().addAll(label1,button1);
	 * scene1 = new Scene(layout1,200,200);
	 * 
	 * 
	 * Button2
	 * button2.setOnAction(e -> window.setScene(scene1));
	 * Layout2
	 * StackPane layout2 = new StackPane();
	 * layout2.getChildren().add(button2);
	 * scene2= new Scene(layout2,600,300);
	 * 
	 * window.setScene(scene1);
	 * window.setTitle("Title here");
	 * window.show();
	 *  */
}
