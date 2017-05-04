import java.util.ArrayList;
public class BitacoraEstacionamiento {

	private TicketEstacionamiento eTicket;	
	private Estacionamiento lugares;
	private Coche autos;
	private Lector leeDatos =new Lector();
	private Caja operacionesCaja= new Caja();
	private ArrayList <Integer> consecutivo= new  ArrayList <Integer>();
	private ArrayList <String> placas= new  ArrayList <String>();
	private ArrayList <String > hEntrada= new  ArrayList <String>();
	private ArrayList <String> hSalida= new  ArrayList <String>();
	private ArrayList <Float> montoCobro= new  ArrayList <Float>();
	
	public BitacoraEstacionamiento(){
		eTicket=new TicketEstacionamiento();
		autos=new Coche();
		lugares=new Estacionamiento();	
	}	

	public void setEntradaAutos(){

		if(lugares.hayCupo()){
		
			System.out.print("Teclea la placa >> ");		
			autos.setPlaca(leeDatos.leeCadena().toUpperCase());
			placas.add(autos.getPlaca());
			eTicket.setHoraEntrada();
			hEntrada.add(eTicket.getHoraEntrada());
			eTicket.sumaFolio();
			consecutivo.add(eTicket.getFolio());				
			hSalida.add(" ");
			montoCobro.add(0f);	
			eTicket.imprimeTicketEntrada(eTicket.getFolio(), eTicket.getHoraEntrada(), autos.getPlaca());	
			lugares.restaCajon();
		}
	}

	public void setSalidaAutos () {
		int temp1=0;
		int i=0;	
		
		System.out.println("Para iniciar el proceso de salida teclea el folio del ticket de entrada.");
		System.out.print(">> ");
		temp1=leeDatos.leeInt();
		if (temp1>0){
			for(Integer temp2:consecutivo){
				if (temp2.compareTo(temp1)==0) {
					i=consecutivo.indexOf(temp1);
					montoCobro.add(i,eTicket.montoACobrar	());
					eTicket.setHoraSalida();		
					hSalida.add(i,eTicket.getHoraSalida());
					eTicket.imprimeTicketSalida(consecutivo.get(i), hEntrada.get(i), hSalida.get(i), placas.get(i), montoCobro.get(i));		
					lugares.sumaCajon();
					operacionesCaja.setIngresos(montoCobro.get(i));
					break;
				} else
					System.out.println("Folio no encontrado.");
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