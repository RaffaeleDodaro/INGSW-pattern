package chainOfrRsponsibilityPrinter;

import javafx.scene.image.ImageView;

/* gestisce le richieste, implementa il 
 * collegamento successivo alla gerarchia
 */
public interface  Handler {

	//mi serve per vedere la stampante attuale che ruolo ha(bn,colori,rosso,blu)
	public void ruolo(PurchaseRequest req);

	public void setProssimaStampante(Handler prossimaStampante, ImageView uno, ImageView due);
}
