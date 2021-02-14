package concreteHandler;

import javax.swing.JOptionPane;

import chainOfrRsponsibilityPrinter.*;
import javafx.scene.image.ImageView;
//gestisce le richieste per le quali e' responsabile. vede il successore

public class StampanteBlu implements Handler {
	private Handler prossimaStampante;

	private ImageView imageRossa;
	private ImageView imageVerde;

	public void setProssimaStampante(Handler prossimaStampante, ImageView imgRossaColori, ImageView imgVerdeColori) {
		this.prossimaStampante = prossimaStampante;
		this.imageRossa = imgRossaColori;
		this.imageVerde = imgVerdeColori;
	}

	@Override
	public void ruolo(PurchaseRequest req) {
		if (req.getTipoStampa().equals("b"))
			imageVerde.setVisible(true);
		else {
			imageRossa.setVisible(true);
			//prossimaStampante.ruolo(req);
			JOptionPane.showMessageDialog(null, "non so gestire la richiesta");
		}
	}
}