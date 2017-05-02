import java.util.*;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha () {
		setFecha();
	}
	
	public void setFecha() {
		Calendar fecha = new GregorianCalendar();
		this.dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.mes = fecha.get(Calendar.MONTH)+1;
		this.anio = fecha.get(Calendar.YEAR);
	}

	public void setFechaSemana(Fecha date) {
		int[] ret_fechaSemana = new int[3];
		date.getFecha(ret_fechaSemana);
		this.dia = ret_fechaSemana[0] + 7;
		this.mes = ret_fechaSemana[1];
		this.anio = ret_fechaSemana[2];
	}

	public void setFechaMes(Fecha date) {
		int[] ret_fechaMes = new int[3];
		date.getFecha(ret_fechaMes);
		this.dia = ret_fechaMes[0];
		this.mes = ret_fechaMes[1] + 01;
		this.anio = ret_fechaMes[2];
	}

	public void getFecha(int[] retorno_fecha) {
		retorno_fecha[0] = dia;
		retorno_fecha[1] = mes;
		retorno_fecha[2] = anio;
	}

	public String devFecha(){
		return this.dia+" / "+this.mes+" / "+this.anio;
	}

	public static void imprimeFecha (int [] retorno_fecha) {
		System.out.println (retorno_fecha[0]+"/"+retorno_fecha[1]+"/"+retorno_fecha[2]);
	}
	

}