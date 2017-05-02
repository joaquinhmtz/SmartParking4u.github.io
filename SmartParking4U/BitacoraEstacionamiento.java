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

	public boolean getRevisaPlacas(ArrayList placas_establec, ArrayList placas_pension){
		String temp1=" ";
		System.out.print("Para iniciar el proceso de salida teclea las placas del auto: ");
		temp1=leeDatos.leeCadena();
		return true;
	}

	public void setEntradaAutos(String placas_param){
		eTicket.setHoraEntrada();
		hEntrada.add(eTicket.getHoraEntrada());

		eTicket.sumaFolio();
		consecutivo.add(eTicket.getFolio());

		autos.setPlaca(placas_param);
		placas.add(autos.getPlaca());
				
		hSalida.add(" ");
		montoCobro.add(0f);	
		eTicket.imprimeTicketEntrada(eTicket.getFolio(), eTicket.getHoraEntrada(), autos.getPlaca());	
	
	}

	public void setSalidaAutos (String placas_param) {
		String temp1=placas_param;
		int i=0;	
		for(String temp2:placas){
			if (temp2.compareTo(temp1)==0) {
				i=placas.indexOf(temp1);
				montoCobro.add(i,eTicket.calculaTarifa());
				eTicket.setHoraSalida();		
				hSalida.add(i,eTicket.getHoraSalida());
				eTicket.imprimeTicketSalida(consecutivo.get(i), hEntrada.get(i), hSalida.get(i), placas.get(i), montoCobro.get(i));		
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

}