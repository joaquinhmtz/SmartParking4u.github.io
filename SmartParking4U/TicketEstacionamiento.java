public class TicketEstacionamiento extends Ticket {

	private Tiempo hora_entrada;
	private Tiempo hora_salida;
	private Tarifa tarifa= new Tarifa();
	
	public TicketEstacionamiento() {
		super();
		hora_entrada = new Tiempo ();
		hora_salida = new Tiempo ();
	}

	public void setHoraEntrada () {
		hora_entrada.setTiempo ();
	}

	public String getHoraEntrada () {
		return hora_entrada.getHora()+ ":" + hora_entrada.getMin();
	}

	public void setHoraSalida () {
		hora_salida.setTiempo ();
	}

	public String getHoraSalida () {
		return hora_salida.getHora()+ ":" + hora_salida.getMin();
	}

	public float montoACobrar (){
		int aux=0;
		int aux1=0;
		int horaCalculo=0;
		float calculo=0;

		aux=hora_salida.getHora()-hora_entrada.getHora();
		aux1=hora_salida.getMin()-hora_entrada.getMin();
		if (aux==0)
			horaCalculo=1;
		else if (aux1<=0)
			horaCalculo=aux;
		else if(aux1>0)
			horaCalculo=aux+1;
		calculo=horaCalculo*tarifa.getTarifaHora();
		return calculo;
	}

	public void imprimeTicketEntrada(int folio, String hora_entrada, String placas) {
		System.out.println(" ");
		System.out.println(" ");
		imprimeTicket();
		System.out.println(" ");
		System.out.println("FECHA: "+getFechaDeHoy());
		System.out.println(" ");
		System.out.println("FOLIO: "+folio);
		System.out.println(" ");
		System.out.println("HORA ENTRADA: " + hora_entrada);
		System.out.println(" ");
		System.out.println("PLACAS: "+placas);
		System.out.println(" ");
		System.out.print("Tarifa por hora o fraccion: $ "+ tarifa.getTarifaHora());
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("La empresa no se hace responsable por danos parciales o totales de su vehiculo.");
		System.out.println(" ");
		System.out.println("Usted deja su vehiculo bajo su propia responsabilidad.");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("QUEJAS Y OBSERVACIONES 5563540597");
		System.out.println(" ");
		System.out.println(" ");
	}

	public void imprimeTicketSalida(int folio, String hora_entrada, String hora_salida, String placas, float montoACobrar) {
		System.out.println(" ");
		System.out.println(" ");
		imprimeTicket();
		System.out.println(" ");
		System.out.println("FECHA: "+getFechaDeHoy());
		System.out.println(" ");
		System.out.println("FOLIO: "+folio);
		System.out.println(" ");
		System.out.println("HORA ENTRADA: " + hora_entrada);
		System.out.println(" ");
		System.out.println("HORA SALIDA: " + hora_salida);
		System.out.println(" ");
		System.out.println("PLACAS: "+placas);
		System.out.println(" ");
		System.out.print("TOTAL: $"+ montoACobrar);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Gracias por su preferencia.");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("QUEJAS Y OBSERVACIONES 5563540597");
		System.out.println(" ");
		System.out.println(" ");
	}
}