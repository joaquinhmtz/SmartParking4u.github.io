public class Estacionamiento {

	private String nombreEstacionamiento;
	private String direccionEstacionamiento;
	private int noDeLugares;

	public Estacionamiento (){
		this.nombreEstacionamiento="Pro Parking";
		this.direccionEstacionamiento="Thiers 9225 Nueva Anzurez, Miguel Hidalgo, CP 9999, CDMX";
		this.noDeLugares=50;
	}

	public void setNombreEstacionamiento(String nombreEstacionamiento_param){
		this.nombreEstacionamiento=nombreEstacionamiento_param;
	}
	
	public String getNombreEstacionamiento(){
		return this.nombreEstacionamiento;
	}

	public void setDireccionEstacionamiento(String direccionEstacionamiento_param){
		this.direccionEstacionamiento=direccionEstacionamiento_param;
	}
	
	public String getDireccionEstacionamiento(){
		return this.direccionEstacionamiento;
	}
	public void setNoLugares(int noDeLugares_param){
		this.noDeLugares=noDeLugares_param;
	}
	
	public int getNoDeLugares(){
		return this.noDeLugares;
	}
}