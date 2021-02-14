package chainOfrRsponsibilityPrinter;
import controller.Client;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../interfaccia.fxml"));
        AnchorPane root = (AnchorPane) loader.load();
        Client controller = (Client) loader.getController();
        Scene scene = new Scene(root, 600, 293);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
