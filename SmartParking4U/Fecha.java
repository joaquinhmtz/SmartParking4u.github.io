import java.util.*;

public class Fecha {
	
	private Calendar fecha = new GregorianCalendar();
	private int dia;
	private int mes;
	private int anio;

	public Fecha () {		
		setFecha();
	}
	
	public void setFecha() {	
		fecha.add(Calendar.MONTH, 1);
		this.dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.mes = fecha.get(Calendar.MONTH);
		this.anio = fecha.get(Calendar.YEAR);
	}

	public String getFecha(){
		return this.dia+"/"+this.mes+"/"+this.anio;
	}

	public String obtenerSalidaFinal(int dias){
		Calendar fechaModificada = new GregorianCalendar();	
		fechaModificada.add(Calendar.MONTH, 1);	
      	fechaModificada.add(Calendar.DAY_OF_YEAR, dias); 
      	this.dia = fechaModificada.get(Calendar.DAY_OF_MONTH);
		this.mes = fechaModificada.get(Calendar.MONTH);
		this.anio = fechaModificada.get(Calendar.YEAR);
      	return dia+"/"+mes+"/"+anio; 	
 	}

}