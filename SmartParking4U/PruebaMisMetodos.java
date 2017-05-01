public class PruebaMisMetodos {

	public static void main (String [] args) {

		Menus menu = new Menus ();
		Lector reader = new Lector ();
		DirectorioUsuarios login = new DirectorioUsuarios ();
		Ticket ticket = new TicketHoras ()
		int opcion; 

		menu.login1 ();
		
		switch (login.iniciarSesion()) {

			case 1:

			do{
				
				menu.operador();
				opcion = reader.leeInt();

				switch (opcion) {

					case 1:

					menu.operadorEntrada();
					ticket.imprimeTicketEntrada();


					break;

					case 2:

					menu.operadorSalida();

					break;

					case 3:

					menu.operadorAltaPension();

					break;

					case 4:

					System.out.println( "¡Hasta luego!");

					break;

					default:

					System.out.println( "Esa no es una opción válida");

					break;
				}
			} while (opcion!=4);

			break;

			case 2:

			do{

				menu.gerente();
				opcion = reader.leeInt();

				switch (opcion) {
					case 1:
					break;

					case 2:
					break;

					case 3:
					break;

					case 4:
					break;

					case 5:

					System.out.println( "¡Hasta luego!");

					break;


					default: 

					System.out.println ( " ¡Hasta luego!");

					break;
				} while (opcion!=4);

			} 

		}

	}