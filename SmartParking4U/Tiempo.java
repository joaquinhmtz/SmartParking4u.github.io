import java.util.*;


public class Tiempo {

	private int hora;
	private int min;
	private int seg;


	public Tiempo () {
		Calendar tiempo = new GregorianCalendar();
		this.hora = tiempo.get(Calendar.HOUR_OF_DAY);
		this.min = tiempo.get(Calendar.MINUTE);
		this.seg = tiempo.get(Calendar.SECOND);
	}

	public Tiempo(int hora_param, int min_param) {
		this.hora = hora_param;
		this.min = min_param;
		this.seg = tiempo.get(Calendar.SECOND);
	}

	public void getTiempo(int[] retorno_tiempo) {
		retorno_tiempo[0] = hora;
		retorno_tiempo[1] = min;
		retorno_tiempo[2] = seg;

	}
	

}