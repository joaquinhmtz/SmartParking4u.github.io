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

	public void getTiempo(int[] retorno_tiempo) {
		retorno_tiempo[0] = hora;
		retorno_tiempo[1] = min;
		retorno_tiempo[2] = seg;

	}

	public static void imprimeHora (int [] retorno_tiempo) {
		System.out.println (retorno_tiempo[0]+":"+retorno_tiempo[1]+":"+retorno_tiempo[2]);
	}
	

}