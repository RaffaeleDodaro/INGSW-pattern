package concreteHandler;

import chainOfrRsponsibilityPrinter.*;
import javafx.scene.image.ImageView;
//gestisce le richieste per le quali e' responsabile. vede il successore

public class StampanteColori implements Handler {
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
		if (req.getTipoStampa().equals("c"))
			imageVerde.setVisible(true);
		else {
			imageRossa.setVisible(true);
			System.out.println("sono colori e passo la stampa a rosso");
			prossimaStampante.ruolo(req);
		}
	}
}
