public class Ticket {

	private int folio;
	private String horaEntrada;
	private String horaSalida;
	private Tiempo hora = new Tiempo ();

	public ticket () {
		this.folio = 0;
		horaEntrada = " ";
		horaSalida = " ";
	}

	public void setFolio (){
		this.folio = 0;
	}

	public void setFolio(folio_param) {
		setFolio();
		this.folio = folio_param + 1;
	}

	public int getFolio() {
		return this.folio;
	}

	public void setHoraEntrada () {
		this.horaEntrada = hora.setTiempo ();

	}
	public void setHoraSalida () {
		this.horaSalida = hora.setTiempo ();

	}

	public void getHoraEntrada () {


	}

	public void getHoraSalida () {

	}



	
}