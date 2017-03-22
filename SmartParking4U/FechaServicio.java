import java.io.*;

public class FechaServicio {

	private String fechaContra;
	private String fechaVenci;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public String pimpLeefechaContra() {
		System.out.print("Fecha de contratación del servicio: ");
		return leeFechacontra();
	}
	private String leeFechacontra() {
		try{
			fechaContra = br.readLine();
		}catch(IOException e) {}
		return fechaContra;
	}
	public String pimpLeefechaVenci() {
		System.out.print("Fecha de vencimiento del servicio: ");
		return leeFechavenci();
	}
	private String leeFechavenci() {
		try{
			fechaVenci = br.readLine();
		}catch(IOException e) {}
		return fechaVenci;
	}
}