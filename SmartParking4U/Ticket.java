public class Ticket {

	protected int folio;

	public Ticket () {
		this.folio = 0;
	}

	public void setFolio (int folio_p) {
		this.folio = folio_p;
	}

	public int getFolio() {
		return this.folio;
	}

	public int sumaFolio () {
		this.folio = this.getFolio() + 1;
		return this.folio;	
	}
	
	public void imprimeTicket () {
		System.out.println ("Sm4rt Parking 4U");
		System.out.println ("Folio: " + sumaFolio());
	}
}