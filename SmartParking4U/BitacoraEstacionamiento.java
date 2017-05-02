public class BitacoraEstacionamiento {

	private TicketEstacionamiento eTicket;
	private Coche autos;
	private Lector leeDatos =new Lector();

	public BitacoraEstacionamiento(){

		eTicket=new TicketEstacionamiento();
		autos=new Coche();	
	}

	public void setEntradaAutos(){
		eTicket.setHoraEntrada();
		eTicket.setFolio(eTicket.getFolio());
		eTicket.sumaFolio();
		System.out.println("Dame las placas del auto: ");
		autos.setPlaca(leeDatos.leeCadena());
	}

	public void setSalidaAutos () {

		eTicket.setHoraSalida();

	}

	public float calculaTarifa(){
		
		Tarifa tarifa= new Tarifa();
		float calculo=0;
		calculo=eTicket.getHoraCalculo()*tarifa.getTarifaHora();

		return calculo;
	}

	public String toString(){

		return eTicket.getFolio()+ "   "+ eTicket.devHorEntr()+"   "+ eTicket.devHorSal()+"   "+autos.getPlaca()+"   "+calculaTarifa();
	}
}