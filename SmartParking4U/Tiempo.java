import java.util.*;


public class Tiempo {

	private int hora;
	private int min;
	private int seg;


	public Tiempo () {
		setTiempo();
	}

	public void setTiempo() {
		Calendar tiempo = new GregorianCalendar();
		this.hora = tiempo.get(Calendar.HOUR_OF_DAY);
		this.min = tiempo.get(Calendar.MINUTE);
		this.seg = tiempo.get(Calendar.SECOND);


	}

	public void setTiempoDefault(Tiempo time) {
		int[] ret_horaEntrada = new int[3];
		time.getTiempo(ret_horaEntrada);
		this.hora = ret_horaEntrada[0] + 1;
		this.min = ret_horaEntrada[1];
		this.seg = ret_horaEntrada[2];

	}

	public void setTiempoHoras(Tiempo time , int horas_param) {
		int[] ret_horaEntrada = new int[3];
		time.getTiempo(ret_horaEntrada);
		this.hora = ret_horaEntrada[0] + horas_param;
		this.min = ret_horaEntrada[1];
		this.seg = ret_horaEntrada[2];

	}

	public void getTiempo(int[] retorno_tiempo) {
		retorno_tiempo[0] = hora;
		retorno_tiempo[1] = min;
		retorno_tiempo[2] = seg;

	}

	public static void imprimeHora (int [] retorno_tiempo) {
		System.out.println (retorno_tiempo[0]+":"+retorno_tiempo[1]+":"+retorno_tiempo[2]);
	}
	

}