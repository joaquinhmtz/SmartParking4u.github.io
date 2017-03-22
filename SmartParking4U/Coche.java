import java.io.*;

public class Coche { 

	private String marca;
	private String placa;

	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


	public void setMarca (String pimpLeeStringM()) {
		this.marca = pimpLeeStringM;
	}

	public String getMarca () {
		return marca;
	}

	public void setPlaca (String pimpLeeStringP()) {
		this.placa = pimpLeeStringP();
	}

	public String getPlaca () {
		return placa;
	}

	private String leeString() {
		
		try{

			dato = entrada.readLine();
			
		}catch(IOException e){}

		return dato;
	}

	private String pimpLeeStringP() {
		System.out.println("Introduce el numero placa");
		return leeString();
	}

	private String pimpLeeStringM() {
		System.out.println("Introduce la Marca");
		return leeString();
	}
}