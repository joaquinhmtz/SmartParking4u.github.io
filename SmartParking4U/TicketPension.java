public class TicketPension extends Ticket {

	private Fecha fecha_entrada;
	private Fecha fecha_salida;
	private int[] ret_fechaSalida = new int[3];
	private int[] ret_fechaEntrada = new int[3];
	
	public TicketPension() {
		super();
		fecha_entrada = new Fecha ();
		fecha_salida = new Fecha ();
	}

	public void setFechaEntrada () {
		fecha_entrada.setFecha();
	}

	public void getFechaEntrada () {
		fecha_entrada.getFecha (ret_fechaEntrada);
	}

	public void setFechaSalidaSemana () {
		fecha_salida.setFechaSemana ( fecha_salida );
	}

	public void getFechaSalidaSemana () {
		fecha_salida.getFecha (ret_fechaSalida);
	}

	public void setFechaSalidaMes () {
		fecha_salida.setFechaMes (fecha_salida);
	}

	public void getFechaSalidaMes () {
		fecha_salida.getFecha (ret_fechaSalida);
	}

	public void imprimeFechaEntrada() {
		fecha_entrada.getFecha (ret_fechaEntrada);
		fecha_entrada.imprimeFecha (ret_fechaEntrada);
	}

	public void imprimeFechaSalidaSemana () {
		fecha_salida.getFecha (ret_fechaSalida);
		fecha_salida.imprimeFecha (ret_fechaSalida);
	}

	public void imprimeFechaSalidaMes() {
		fecha_salida.getFecha (ret_fechaSalida);
		fecha_salida.imprimeFecha (ret_fechaSalida);
	}

	public void imprimeTicketPensionSemana() {
		imprimeTicket();
		imprimeFechaEntrada();
		imprimeFechaSalidaSemana();
	}

	public void imprimeTicketPensionMes() {

		imprimeTicket();
		imprimeFechaEntrada();
		imprimeFechaSalidaMes();
	}
}