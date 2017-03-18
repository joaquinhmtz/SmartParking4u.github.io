import java.io.*;

public class Pensionados {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	private String dato;
	private String contrafecha;
	private String vencifecha;
	private String nombre;
	private String tipoPen;
	private int cajon = 0;
	private String placas;


	public void contraFecha() {
		System.out.print("Fecha de contratación del servicio: ");
		this.leeDato1();
	}

	public void vencifecha() {
		System.out.print("Fecha de vencimiento del servicio: ");
		this.leeDato2();
	}

	public void nombre() {
		System.out.print("Nombre el propietario: ");
		this.leeDato3();
	}

	public void tipoPension() {
		System.out.print("Tipo de pensión: ");
		this.leeDato4();
	}

	public void cajon() {
		System.out.print("Cajón designado: ");
		this.leeDato5();
	}

	public void placas() {
		System.out.print("Placas del automóvil: ");
		this.leeDato6();
	}

	public void printpension() {
		System.out.println("Fecha de contratación: "+contrafecha);
		System.out.println("Fecha de vencimiento: "+vencifecha);
		System.out.println("Nombre: "+nombre);
		System.out.println("Tipo de pensión: "+tipoPen);
		System.out.println("Cajón designado: "+cajon);
		System.out.println("Placas del automóvil: "+placas);
	}

	private String leeDato2() {
		try{
			vencifecha = br.readLine();
		}catch(IOException e) {}
		return vencifecha;
	} 

	private String leeDato1() {
		try{
			contrafecha = br.readLine();
		}catch(IOException e) {}
		return contrafecha;
	} 

	private String leeDato3() {
		try{
			nombre = br.readLine();
		}catch(IOException e) {}
		return nombre;
	} 

	private String leeDato4() {
		try{
			tipoPen = br.readLine();
		}catch(IOException e) {}
		return tipoPen;
	} 

	private String leeDato6() {
		try{
			placas = br.readLine();
		}catch(IOException e) {}
		return placas;
	} 

	private int leeDato5() {
		try{
			dato = br.readLine();
			cajon = Integer.parseInt(dato);
		}catch(NumberFormatException e) {
			System.out.print("Dato inválido, se tomará por " +cajon);
		}catch(IOException e) {}
		return cajon;
	} 

	public void Datos() {
		printpension(contrafecha(),vencifecha(),nombre(),tipoPension(),cajon(),placas());
	}
	
}