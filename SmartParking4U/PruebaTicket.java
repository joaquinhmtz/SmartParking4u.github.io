import java.util.ArrayList;
public class PruebaTicket {

	public static void main(String[] args) {
		
	BitacoraEstacionamiento prueba = new BitacoraEstacionamiento();
	
	prueba.setEntradaAutos();
	prueba.setEntradaAutos();
	prueba.setEntradaAutos();
	prueba.setSalidaAutos();

    System.out.println(prueba.getPlacas());
    System.out.println(prueba.getHentrada());
    System.out.println(prueba.getConsecutivo());
    System.out.println(prueba.getMontoCobro());
    System.out.println(prueba.getHSalida());

	}

}