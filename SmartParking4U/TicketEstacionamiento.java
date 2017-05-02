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

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 688ffafa4bac7637c56466e661fa46458289091c
		hora_entrada.getTiempo (ret_horaEntrada);
		hora_salida.getTiempo(ret_horaSalida);
		hora=ret_horaSalida[0]-ret_horaEntrada[0];
		minutos=ret_horaSalida[1]-ret_horaEntrada[1];
<<<<<<< HEAD
=======
		
=======
		hora=ret_horaSalida[0]-ret_horaEntrada[0];
		minutos=ret_horaSalida[1]-ret_horaEntrada[1];
>>>>>>> 20ffdef0d63178ea660b5a18e65c2e09d66656f6
>>>>>>> 688ffafa4bac7637c56466e661fa46458289091c
		if (minutos>0) 
			minutos=1;
		else
			minutos=0;
<<<<<<< HEAD
		if (hora==0) hora=1;
=======
<<<<<<< HEAD

		if (hora==0) hora=1;

=======
>>>>>>> 20ffdef0d63178ea660b5a18e65c2e09d66656f6
>>>>>>> 688ffafa4bac7637c56466e661fa46458289091c
		resultado=hora+minutos;
		return resultado;
	}

	public float calculaTarifa(){
		
		Tarifa tarifa= new Tarifa();
		float calculo=0;
		calculo=getHoraCalculo()*tarifa.getTarifaHora();
		return calculo;
	}

	public void imprimeHoraEntrada() {
		hora_entrada.getTiempo(ret_horaEntrada);
		System.out.println(hora_entrada.devuelveHora(ret_horaEntrada));
	}

	public void imprimeHoraSalida() {
		hora_salida.getTiempo(ret_horaSalida);
		System.out.println(hora_salida.devuelveHora(ret_horaSalida));
	}

	public void imprimeTicketHoras() {
		imprimeTicket();
		imprimeHoraEntrada();
		imprimeHoraSalida();
	}

	public String devHorEntr(){ 
		hora_entrada.getTiempo(ret_horaEntrada);
		return hora_entrada.devuelveHora(ret_horaEntrada);
	}

	public String devHorSal(){ 
		hora_salida.getTiempo(ret_horaSalida);
		return hora_salida.devuelveHora(ret_horaSalida);
	}

}