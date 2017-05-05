import java.util.ArrayList;

public class OperaEstacionamiento {


	public static void main (String [] args ){

		BitacoraEstacionamiento prueba = new BitacoraEstacionamiento();
		Menus menu = new Menus ();
		Lector reader = new Lector ();
		DirectorioUsuarios login = new DirectorioUsuarios ();
		Pensionados pensionado = new Pensionados ();
		int opcion;
		int intentos = 3; 
		boolean valida = true;

		

		if (login.iniciarSesion() == false ){
			opcion = 4;
		} else {
			opcion = 0;
		}

		while (opcion!=4) {				
			menu.menuOperador();
			opcion = reader.leeInt();

			switch (opcion) {

				case 1:
				menu.menuOperadorEntrada();
				prueba.setEntradaAutos();
				break;
				case 2:
				menu.menuOperadorSalida();
				prueba.setSalidaAutos();
				break;
				case 3:
				menu.menuOperadorAltaPension();
				pensionado.pimpPensionado();
				break;

				case 4:
				System.out.println( "¡Hasta luego! \n");
				break;

				default:
				System.out.println( "Esa no es una opción válida \n");
				break;
			}

		} 
	}
}	

