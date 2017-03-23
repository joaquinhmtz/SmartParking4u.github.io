import java.java.io.*; 

public class TipoPension {

	private int dia;
	private int mes;
	private int anio;
	private String dato;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	private void printMenu() {
		System.out.println("Contratos: ");
		System.out.println("1.- Día");
		System.out.println("2.- Mes");
		System.out.println("3.- Año");
		System.out.println("-----------");
	}
	public void menu() {

		this.printMenu();

		int option = this.leeOption();

		switch(option) {

			case 1:
			System.out.print("Ingresa tu número de días: ");
			this.leeDia();
			break;

			case 2:
			System.out.print("Ingresa el número de meses: ");
			this.leeMes();
			break;

			case 3:
			System.out.print("Ingresa el número de años: ");
			this.leeAnio();
			break;	
			
		}
	}
	private int leeOption() {
		int opt = 0;
		try{
			dato = br.readLine();
			opt = Integer.parseInt(dato);
		}catch(IOException e) {}
		return opt;
	}
	private int leeDia() {
		try{
			dato = br.readLine();
			dia = Integer.parseInt(dato);
		}catch(IOException e) {}
		return dia;
	}
	private int leeMes() {
		try{
			dato = br.readLine();
			mes = Integer.parseInt(dato);
		}catch(IOException e) {}
		return mes;
	}
	private int leeAnio() {
		try{
			dato = br.readLine();
			anio = Integer.parseInt(dato);
		}catch(IOException e) {}
		return anio;
	}

}
