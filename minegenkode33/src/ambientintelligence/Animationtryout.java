package ambientintelligence;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Animationtryout extends Application {
   
	//private Stage window;
	//Scene scene1,scene2;
	
	@Override
    public void start(Stage stage) throws IOException {
		//window = primaryStage;
		//mainWindow();
		
		Parent root = FXMLLoader.load(getClass().getResource("Fxtryout.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
	
	//public void changeScreen()
	//Implementere km avstand man vil ha? Eventuelt si noe om det
	//Lage en med map og en med liste
	//alder, studenrabatt osv. 
	//skrive hvordan vi kan få info fra kjeder?
	/*Til å gjøres:
	 * Lage ny map med rabatter som popper opp i nærheten av der man er
	 * Registrering, trykk se map så dukker den over opp igjen
	 * Få de røde buttonsene til å gå på paths
	 * Kunne trykke på andre mennesker?
	 * 
	 * public void mainWindow() {
		 try {
			FXMLLoader loader = new FXMLLoader(Animationtryout.class.getResource("Fxtryout.fxml")); 
			StackPane pane = loader.load();
			
			FxtryoutController fxcontroller = loader.getController();
			fxcontroller.getAnim(this);
			
			Scene scene = new Scene(pane);
			window.setScene(scene);
			window.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }*/

    public static void main(String[] args) {
        Application.launch(args);
    }
}
