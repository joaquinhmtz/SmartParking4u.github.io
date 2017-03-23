import java.util.*;


public class Tiempo {

	private int hora;
	private int min;
	private int seg;


	public void setTiempo() {
		Calendar tiempo = new GregorianCalendar();
		this.hora = tiempo.get(Calendar.HOUR_OF_DAY);
		this.min = tiempo.get(Calendar.MINUTE);
		this.seg = tiempo.get(Calendar.SECOND);
	}

	public void setTiempo(int hora_param, int min_param, int seg_param) {
		this.hora = hora_param;
		this.min = min_param;
		this.seg = seg_param;
	}

	public void getTiempo(int[] retorno_tiempo) {
		retorno_tiempo[0] = hora;
		retorno_tiempo[1] = min;
		retorno_tiempo[2] = seg;

	}

	public static void printTiempo(int[] tiempo) {
		System.out.println(tiempo[0]+"/"+tiempo[1]+"/"+tiempo[2]);
	}
	

}