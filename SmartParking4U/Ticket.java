public class Ticket {

	private Fecha fechaDeHoy;
	private Estacionamiento nomEstac;
	private int folio;

	public Ticket () {
		setFolio(1000);
		fechaDeHoy = new Fecha ();
		nomEstac=new Estacionamiento();
	}

	public void setFechaDeHoy () {
		fechaDeHoy.setFecha();
	}

	public String getFechaDeHoy () {
		return fechaDeHoy.getFecha();
	}

	public void setFolio (int folio_p) {
		this.folio = folio_p;
	}

	public int getFolio() {
		return this.folio;
	}

	public void sumaFolio () {
		this.folio++;	
	}
	
	public void imprimeTicket () {
		System.out.println(nomEstac.getNombreEstacionamiento());
		System.out.println(nomEstac.getDireccionEstacionamiento());
	}
}