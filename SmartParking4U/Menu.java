import java.io.*;

public class Menu {
    private int opc = 0;

    private Lector reader = new Lector();
    private Persona persona1 = new Persona();
    private FechaServicio fecha = new FechaServicio();
    private Contrato servicio = new Contrato();
    private Cajon lugar = new Cajon();
    private Estacionamiento lugares = new Estacionamiento();
    //private int [] cajon = new int[20];

    BufferedReader entrada = new BufferedReader (new InputStreamReader (System.in));

    private void printMenu () {

        System.out.println ("___________________________");
        System.out.println ("|    Smart Parking 4U     |");
        System.out.println ("| Escoge tipo de servicio |");
        System.out.println ("|1.-  Estacionamiento     |");
        System.out.println ("|2.-      Pension         |");
        System.out.println ("|3.-       Salir          |");
        System.out.println ("|_________________________|");


    }

    public void menu ( ) {

<<<<<<< HEAD
			case 1:
			System.out.println ("Escogiste Estacionamiento");
=======
        this.printMenu();
        try{
            opc = Integer.parseInt (entrada.readLine());
        } catch (IOException e){}
        switch(opc){
>>>>>>> 4485d339f1972673c74e9c0ca020ec0898c446c2

            case 1:
            System.out.println ("Escogiste Estacionamiento");
            System.out.println ("Escoge el lugar dónde desee aparcar su automóvil: ");
            reader.leeIntArreglo();

<<<<<<< HEAD
			
			break;
			case 2:
			System.out.println ("Escogiste Pension");
=======
>>>>>>> 4485d339f1972673c74e9c0ca020ec0898c446c2

            
            break;

            case 2:
            System.out.println("Escogiste Pension");
            System.out.print("Nombre del conductor: ");
            persona1.setNombre(reader.leeString());
            servicio.Menu(0);
            System.out.print("¿De qué tamaño requiere el cajón? ");
            lugar.setTamanio(reader.leeString());
            System.out.print("¿Necesita lugar para discapacitado? ");
            lugar.setTipo(reader.leeString());
            System.out.print("Escoge el lugar dónde desee aparcar su automóvil: ");
            reader.leeIntArreglo();
            System.out.print("Fecha de contratación del servicio: ");
            fecha.setFechaContra(reader.leeString());
            System.out.print("Fecha de vencimiento del servicio: ");
            fecha.setFechaVenci(reader.leeString());

            break;

            case 3:
            System.out.println ("Hasta luego");

            break;
            default:

            System.out.println ("Esa no es una opcion valida");
            
            break;


        }

    }










}