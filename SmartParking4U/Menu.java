import java.io.*;

public class Menu {
    private int opc = 0;

    Lector reader = new Lector();
    Persona persona1 = new Persona();
    FechaServicio fecha = new FechaServicio();
    Contrato servicio = new Contrato();

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

        this.printMenu();
        try{
            opc = Integer.parseInt (entrada.readLine());
        } catch (IOException e){}
        switch(opc){

            case 1:
            System.out.println ("Escogiste Estacionamiento");
            System.out.println ("Ingresa el numero de cajon");



            
            break;

            case 2:
            System.out.println("Escogiste Pension");
            System.out.print("Nombre del conductor: ");
            persona1.setNombre(reader.leeString());
            servicio.Menu(0);
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