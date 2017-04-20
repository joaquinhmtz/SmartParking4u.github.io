public class Estacionamiento {

	private String nombreEstacionamiento;
	private int noDeLugares;

	public void setNombreEstacionamiento(String nombreEstacionamiento_param){
		this.nombreEstacionamiento=nombreEstacionamiento_param;
	}
	
	public String getNombreEstacionamiento(){
		return this.nombreEstacionamiento;
	}

	public void setNoLugares(int noDeLugares_param){
		this.noDeLugares=noDeLugares_param;
	}
	
	public int getNoDeLugares(){
		return this.noDeLugares;
	}
}