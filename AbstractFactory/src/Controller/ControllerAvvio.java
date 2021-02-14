package Controller;

import Prove.AbstractCreatorCar;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Auto;

public class ControllerAvvio {

    public void scegli(ActionEvent actionEvent) {
        AbstractCreatorCar car = AbstractCreatorCar.getCar(txtScegliMarca.getText(), txtScegliTipologia.getText());

        Auto a = car.createAuto(txtScegliTipologia.getText());

        stampa(a);
    }

    private void stampa(Auto a)
    {
        lblCavalli.setText(Integer.toString(a.getCavalli()));
        lblFamiglia.setText(a.getTipologia());
        lblMarca.setText(a.getMarca());
        lblModello.setText(a.getModello());
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
