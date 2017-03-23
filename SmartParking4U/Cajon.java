import java.io.*;

public class Cajon {

	private String tamanio;
	private String tipo;
	private int numero;
	private String dato;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public String pimpLeetamanio() {
		System.out.print("Tamaño del automóvil: ");
		return leeTamanio();
	}
	private String leeTamanio() {
		try{
			tamanio = br.readLine();
		}catch(IOException e) {}
		return tamanio;
	}
	public String pimpLeeTipo() {
		System.out.print("Discapacitado/NO Discapacitado: ");
		return leetipo();
	}
	private String leetipo() {
		try{
			tipo = br.readLine();
		}catch(IOException e) {}
		return tipo;
	}
	public void pimpLeeNumero() {
		System.out.print("Número de cajón asignado: ");
		 this.Condition();

	}
	private int leenumero() {
		try{
			dato = br.readLine();
			numero = Integer.parseInt(dato);
		}catch(IOException e) {}
		return numero;
	}
	private void Condition() {
		this.leenumero();		
		int num_param = 0;
		num_param = numero;
		if(num_param == numero) {
			System.out.println("El cajón designado, ya está ocupado");
		} else
			System.out.println("El cajón designado, está libre");

	}
	
}