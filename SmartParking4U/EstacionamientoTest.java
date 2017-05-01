import java.io.*;

public class EstacionamientoTest {

	private Ticket ticket = new Ticket ();
	private static TicketPension ticketP = new TicketPension();
	private static TicketHoras ticketH = new TicketHoras();
	private static int opc;

	private static BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
	
	public static void main(String[] args) {


		
		System.out.println("*  Sm4rtParking4U  *");
		System.out.println("1.- Estacionamiento ");
		System.out.println("2.- Pensión");
		System.out.println("3.- Salir");

		try {

			opc = Integer.parseInt (entrada.readLine());

		} catch (Exception e) {

			System.out.println ("Ese no es un valor valido");
			System.out.println ("Se tomará como opcion 3 ");
		}

		switch(opc) {

			
			case 1:
				System.out.println("Estacionamiento");
				ticketH.imprimeTicketHoras ();
				System.out.println("No hay tinta");
				ticketH.imprimeTicketHoras ();
			break;

			case 2:
				System.out.println("Pensión");
				ticketP.imprimeTicketPension();
			break;

			default:
				System.out.println("Hasta luego");
			break;

		}

	}
}