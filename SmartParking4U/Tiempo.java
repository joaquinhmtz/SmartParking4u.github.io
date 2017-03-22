import java.util.*;
import java.io.*;

public class Tiempo{

	private int hora;
	private int min;
	private int seg;

	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public void asignarTiempo() {
		Calendar tiempo = new GregorianCalendar();
		this.hora = tiempo.get(Calendar.HOUR_OF_DAY);
		this.min = tiempo.get(Calendar.MINUTE);
		this.seg = tiempo.get(Calendar.SECOND);
	}

	public void asignarTiempo(int hora_param ) {
		this.asignarTiempo();
		this.hora = hora_param;

	}	

	public void asignatTiempo(int hora_param , int min_param) {
		this.asignarTiempo();
		this.hora = hora_param;
		this.min = min_param;
	}

	public void asignatTiempo(int hora_param, int min_param, int seg_param) {
		this.hora = hora_param;
		this.min = min_param;
		this.seg = seg_param;
	}

	public void obtenerTiempo(int[] retorno_tiempo) {
		retorno_tiempo[0] = hora;
		retorno_tiempo[1] = min;
		retorno_tiempo[2] = seg;

	}

	public static void printTiempo(int[] tiempo) {
		System.out.println(tiempo[0]+"/"+tiempo[1]+"/"+tiempo[2]);
	}
	

}