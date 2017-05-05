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

	public String getTiempo(){
		return this.hora+":"+this.min;
	}

	public int getHora(){
		return this.hora; 
	}

	public int getMin(){
		return this.min; 
	}
}