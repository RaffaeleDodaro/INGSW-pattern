package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/Avvio.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		Controller.ControllerAvvio controller = (Controller.ControllerAvvio) loader.getController();
		Scene scene = new Scene(root, 516, 263);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Auto");
		primaryStage.show();
	}
}
