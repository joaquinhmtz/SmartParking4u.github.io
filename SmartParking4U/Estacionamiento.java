public class Estacionamiento {

	private String nombreEstacionamiento;
	private String direccionEstacionamiento;
	private int capacidadEstacionamiento;
	private int lugaresDisponibles;

	public Estacionamiento (){
		this.nombreEstacionamiento="Pro Parking";
		this.direccionEstacionamiento="Thiers 9225 Nueva Anzurez, Miguel Hidalgo, CP 9999, CDMX";
		this.capacidadEstacionamiento=50;
		setLugaresDisponibles(50);
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

	public void setCapacidadEstacionamiento(int noDeLugares_param){
		this.capacidadEstacionamiento=noDeLugares_param;
	}
	
	public int getCapacidadEstacionamiento(){
		return this.capacidadEstacionamiento;
	}

	public void setLugaresDisponibles(int lugares_param){
		this.lugaresDisponibles=lugares_param;
	}

	public int getLugaresDisponibles(){
		return this.lugaresDisponibles;
	}

	public void restaCajon(){
		if(lugaresDisponibles>0)
			this.lugaresDisponibles--;
	}

	public void sumaCajon(){
		if(lugaresDisponibles<capacidadEstacionamiento)
			this.lugaresDisponibles++;
	}

	public boolean hayCupo(){
		if(getLugaresDisponibles()>0)
			return true;
		else {
			System.out.println("No hay cupo!");
			return false;
		}
	}
}