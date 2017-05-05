
public class Coche { 

	
	private String placa;
	private String marca;

	public Coche (){
		this.placa = "unknown";
		this.marca = "unknown";
	}

	public void setPlaca (String placa) {
		this.placa = placa;
	}

	public String getPlaca () {
		return placa;
	}

	public void setMarca (String marca) {
		this.marca = marca;
	}

	public String getMarca () {
		return marca;
	}
	
}
