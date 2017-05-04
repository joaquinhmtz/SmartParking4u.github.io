import java.util.ArrayList;

public class BitacoraPension {
	
	private TicketPension ticket;
	private Pensionados datos;
	private Lector reader = new Lector();
	private Coche auto;

	ArrayList <Integer> folio = new ArrayList <Integer>();
	ArrayList <String> nombre = new ArrayList <String>();
	ArrayList <String> placas = new ArrayList <String>();
	ArrayList <String> fechaEntrada = new ArrayList <String>();
	ArrayList <String> fechaSalida = new ArrayList <String>();
	ArrayList <Float> montoCobro = new ArrayList <Float>();

	public BitacoraPension() {
		ticket = new TicketPension();
		auto = new Coche();
		datos = new Pensionados();
	}

	public void setEntradaPension(String placas) {
		ticket.sumaFolio();
		folio.add(ticket.getFolio());
		auto.setPlaca(placas);
		placas.add(auto.getPlaca());
		ticket.imprimeTicketEntrada(ticket.getFolio(), auto.getPlaca());
	}

	public void setSalidaPension(String placas) {
		String aux = placas;
		int i  = 0;
		for(String aux2:placas) {
			if(aux2.compareTo(aux) == 0) {
				i = placas.indexOf(aux);
			}
		}
	}

	public ArrayList getPlaca() {
		return placas;
	}

	public ArrayList getFolio() {
		return folio;
	}

	public ArrayList getFechaEntrada() {
		return fechaEntrada;
	}

	public ArrayList getFechaSalida() {
		return fechaSalida;
	}

	public ArrayList getNombre() {
		return nombre;
	}
}