public class TicketPension extends Ticket {

	private Fecha fecha_salida;
<<<<<<< HEAD
=======
	private int[] ret_fechaSalida = new int[3];
	private Tarifa tarifa = new Tarifa();
>>>>>>> e87983488bf0ab0dab5bb06d543d25f8076a4e42
	
	public TicketPension() {
		super();
		fecha_salida=new Fecha ();		
	}

	public void setFechaSalida () {
		fecha_salida.setFecha();
	}

	public String getFechaSalida() {
		return fecha_salida.getFecha();
	}

	public String getFechaSalidaMes () {
		return fecha_salida.obtenerSalidaFinal(30);
	}

	public String getFechaSalidaSemana () {
		return fecha_salida.obtenerSalidaFinal(7);
	}

	public void imprimeTicketEntradaPension(int folio, String hora_entrada, String placas) {
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
		System.out.print("Su contrato vence el : "+ tarifa.getTarifaHora());
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

	public void imprimeTicketEntrada(int folio, String placas) {
		System.out.println("FOLIO: "+folio);
		System.out.println("PLACAS: "+placas);
	}

	public void imprimeTicketSalida(int folio, String placas) {
		System.out.println("FOLIO: "+folio);
		System.out.println("PLACAS: "+placas);
	}

}