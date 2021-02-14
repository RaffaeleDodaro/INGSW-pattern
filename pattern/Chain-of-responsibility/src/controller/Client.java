package controller;

import chainOfrRsponsibilityPrinter.*;
import concreteHandler.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;

public class Client {

	@FXML
	void stampa(ActionEvent event) {
		reset();
		Handler c1 = new StampanteBiancoNero();
		Handler c2 = new StampanteColori();
		Handler c3 = new StampanteRosso();
		Handler c4 = new StampanteBlu();

		c1.setProssimaStampante(c2, imgRossaBN, imgVerdeBN);
		c2.setProssimaStampante(c3, imgRossaColori, imgVerdeColori);
		c3.setProssimaStampante(c4, imgRossaRosso, imgVerdeRosso);
		c4.setProssimaStampante(null, imgRossaBlu, imgVerdeBlu);
		PurchaseRequest req=null;
		
		if(cbColori.isSelected())
			req = new PurchaseRequest("c");
		
		else if(cbRosso.isSelected())
			req = new PurchaseRequest("r");
		
		else if(cbBlu.isSelected())
			req = new PurchaseRequest("b");
		
		else if(cbBiancoNero.isSelected())
			req = new PurchaseRequest("bn");
		
		//se non ho selezionato nessuna checkbox(mi serve per capire il comportamento 
		//nel caso in cui nessuna stampante e' capace di gestire la richiesta)
		else if(!cbBiancoNero.isSelected()&&!cbBlu.isSelected()&&!cbRosso.isSelected()&&!cbColori.isSelected())
			req = new PurchaseRequest(" ");
		
		c1.ruolo(req);
	}
	
	private void reset()
	{
		imgRossaBN.setVisible(false);
		imgVerdeBN.setVisible(false);
		
		imgRossaColori.setVisible(false);
		imgVerdeColori.setVisible(false);
		
		imgRossaRosso.setVisible(false);
		imgVerdeRosso.setVisible(false);
		
		imgRossaBlu.setVisible(false);
		imgVerdeBlu.setVisible(false);
	}
	@FXML
	private Button btnStampa;

	@FXML
	private CheckBox cbBiancoNero;

	@FXML
	private ImageView imgRossaBN;

	@FXML
	private ImageView imgRossaBlu;

	@FXML
	private ImageView imgVerdeBlu;

	@FXML
	private ImageView imgVerdeRosso;

	@FXML
	private CheckBox cbRosso;

	@FXML
	private CheckBox cbBlu;

	@FXML
	private ImageView imgVerdeBN;

	@FXML
	private ImageView imgVerdeColori;

	@FXML
	private ImageView imgRossaRosso;

	@FXML
	private ImageView imgRossaColori;

	@FXML
	private CheckBox cbColori;

}
