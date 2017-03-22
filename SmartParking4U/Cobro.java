import java.io.*;

public class Cobro {

	private float costoXHora;
	private float costoXFrac;

	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	public void setCostoXHora (float pimpLeeFloat()) {
		this.costoXHora = pimpLeeFloat;
	}

	public int getCostoXHora () {
		return costoXHora;
	}

	public void setCostoXFrac (float pimpLeeFloat()) {
		this.costoXHora = pimpLeeFloat;
	}

	public int getCostoXFrac () {
		return costoXHora;
	}

	private float leeFloat() {
		
		try{
			
			dato = float.parseFloat (entrada.readLine());
			

		}catch(NumberFormatException e){
			System.out.println("Dato invalido");
		}catch(IOException e) {
			System.out.println("Dato invalido");
		}

		return dato;
	}

}