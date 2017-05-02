public class Ticket {

	private Fecha fecha_entrada;
	private Estacionamiento nomEstac;
	private int folio;
	private int[] ret_fechaEntrada = new int[3];

	public Ticket () {
		this.folio=0;
		fecha_entrada = new Fecha ();
		nomEstac=new Estacionamiento();
	}

	public void setFechaEntrada () {
		fecha_entrada.setFecha();
	}

	public void getFechaEntrada () {
		fecha_entrada.getFecha (ret_fechaEntrada);
	}

	public void imprimeFechaEntrada() {
		fecha_entrada.getFecha (ret_fechaEntrada);
		fecha_entrada.imprimeFecha (ret_fechaEntrada);
	}

	public void setFolio (int folio_p) {
		this.folio = folio_p;
	}

	public int getFolio() {
		return this.folio;
	}

	public int sumaFolio () {
		return this.folio++;	
	}
	
	public void imprimeTicket () {
		System.out.println(nomEstac.getNombreEstacionamiento());
		System.out.println ("Folio: " + getFolio());
		imprimeFechaEntrada();
	}
}