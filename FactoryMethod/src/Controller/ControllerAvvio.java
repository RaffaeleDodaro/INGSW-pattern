package Controller;

import Prove.CreatorCar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Auto;

public class ControllerAvvio {

    public void scegli(ActionEvent actionEvent) {
        Auto car = CreatorCar.getCar(txtScegliMarca.getText(), txtScegliTipologia.getText());
        lblCavalli.setText(Integer.toString(car.getCavalli()));
        lblFamiglia.setText(car.getTipologia());
        lblMarca.setText(car.getMarca());
        lblModello.setText(car.getModello());
    }

    public void chiudi(ActionEvent actionEvent) {
        System.exit(0);
    }



    @FXML
    private Label lblModello;

    @FXML
    private Label lblMarca;

    @FXML
    private Label lblFamiglia;

    @FXML
    private Button btnScegli;

    @FXML
    private TextField txtScegliMarca;

    @FXML
    private Button btnChiudi;

    @FXML
    private Label lblCavalli;

    @FXML
    void scegliMarca(ActionEvent event) {
    }

    @FXML
    void ricominciaConfigurazione(ActionEvent event) {
    }

    @FXML
    private TextField txtScegliTipologia;
}
