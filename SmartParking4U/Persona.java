import java.io.*;

public class Persona {

	private String nombre;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public String pimpLeeNombre() {
		System.out.print("Nombre del propietario: ");
		return leeNombre();
	}
	private String leeNombre() {
		try{
			nombre = br.readLine();
		}catch(IOException e) {}
		return nombre;
	}

}