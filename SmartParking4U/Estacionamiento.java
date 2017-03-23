import java.io.*;

public class Estacionamiento {

	private int estacionamiento [] = new int [20];
	private String tamanio;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public String pimpLeeCajontam() {
		System.out.print("Tamaño del cajón que requiere: ");
		return leecajonTam();
	}
	private String leecajonTam() {
		try{
			tamanio = br.readLine();
		}catch(IOException e) {}
		return tamanio;
	}
}