
public class Coche { 

	private String tamanio;
	private String placa;


	public Coche (){
		this.tamanio = null;
		this.placa = null;
	}


	public void setTamanio (String tamanio) {
		this.tamanio = tamanio;
	}

	public String getTamanio () {
		return tamanio;
	}

	public void setPlaca (String placa) {
		this.placa = placa;
	}

	public String getPlaca () {
		return placa;
	}
}
