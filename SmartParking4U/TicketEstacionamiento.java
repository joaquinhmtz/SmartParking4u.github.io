public class TicketEstacionamiento extends Ticket {

	private Tiempo hora_entrada;
	private Tiempo hora_salida;
	private int[] ret_horaEntrada = new int[3];
	private int[] ret_horaSalida = new int[3];

	
	public TicketEstacionamiento() {
		super();
		hora_entrada = new Tiempo ();
		hora_salida = new Tiempo ();
		//hora_salida.setTiempoDefault(hora_entrada);
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

	public int getHoraCalculo (){
		int hora=0;
		int minutos=0;
		int resultado=0;

		hora=ret_horaSalida[0]-ret_horaEntrada[0];
		minutos=ret_horaSalida[1]-ret_horaEntrada[1];
		if (minutos>0) 
			minutos=1;
		else
			minutos=0;
		resultado=hora+minutos;

		return resultado;
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