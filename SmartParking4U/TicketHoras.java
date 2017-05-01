public class TicketHoras extends Ticket {

	private Tiempo hora_entrada;
	private Tiempo hora_salida;
	private int[] ret_horaEntrada = new int[3];
	private int[] ret_horaSalida = new int[3];

	
	public TicketHoras() {
		super();
		hora_entrada = new Tiempo ();
		hora_salida = new Tiempo ();
		hora_salida.setTiempoDefault(hora_entrada);
	}

	public void setHoraEntrada () {
		hora_entrada.setTiempo ();
	}

	public void getHoraEntrada () {
		hora_entrada.getTiempo (ret_horaEntrada);
	}

	public void setHoraSalida () {
		hora_salida.setTiempo ();
	}

	public void getHoraSalida () {
		hora_salida.getTiempo (ret_horaSalida);
	}

	public void imprimeHoraEntrada() {
		hora_entrada.getTiempo(ret_horaEntrada);
		hora_entrada.imprimeHora (ret_horaEntrada);
	}

	public void imprimeHoraSalida() {
		hora_salida.getTiempo(ret_horaSalida);
		hora_salida.imprimeHora(ret_horaSalida);
	}

	public void imprimeTicketHoras() {
		imprimeTicket();
		imprimeHoraEntrada();
		imprimeHoraSalida();

	}

}