import java.util.ArrayList;
public class BitacoraEstacionamiento {

	private TicketEstacionamiento eTicket;	
	private Coche autos;
	private Lector leeDatos =new Lector();
	
	ArrayList <Integer> consecutivo= new  ArrayList <Integer>();
	ArrayList <String> placas= new  ArrayList <String>();
	ArrayList <String > hEntrada= new  ArrayList <String>();
	ArrayList <String> hSalida= new  ArrayList <String>();
	ArrayList <Float> montoCobro= new  ArrayList <Float>();

	
	public BitacoraEstacionamiento(){

		eTicket=new TicketEstacionamiento();
		autos=new Coche();	
	}

	public void setEntradaAutos(){

		eTicket.setFolio(eTicket.getFolio());
		eTicket.sumaFolio();
		System.out.println("Dame las placas del auto: ");
		autos.setPlaca(leeDatos.leeCadena());
		placas.add(autos.getPlaca());
		hEntrada.add(eTicket.devHorEntr());
		consecutivo.add(eTicket.getFolio());
		hSalida.add(" ");
		montoCobro.add(0f);
	}

	public void setSalidaAutos () {
		String temp1=" ";

		System.out.print("Dame las placas del carro: ");
		temp1=leeDatos.leeCadena();

		for(String temp2:placas){
			if (temp2.compareTo(temp1)==0) {
				montoCobro.add(placas.indexOf(temp1),eTicket.calculaTarifa());		
				hSalida.add(placas.indexOf(temp1), eTicket.devHorSal());			
				break;
			}
		}		
	}

	public ArrayList getPlacas(){
		return placas;
	}
	
	public ArrayList getHentrada(){
		return hEntrada;
	}
	
	public ArrayList getConsecutivo(){
		return consecutivo;
	}

	public ArrayList getMontoCobro(){
		return montoCobro;
	}

	public ArrayList getHSalida(){
		return hSalida;
	}	

	public String toString(){
		return eTicket.getFolio()+ "   "+ eTicket.devHorEntr()+"   "+ eTicket.devHorSal()+"   "+autos.getPlaca()+"   "+eTicket.calculaTarifa();
	}
}