public class Pensionados {

	private String nombreDueno;
	private String contactoDueno;
	private Coche auto;

	public pensionados () {

	nombreDueno = "Desconocido";
	contactoDueno = "Desconocido";
	auto = new Coche ();

	}

	public  void setNombreDueno(String nombre_p) {
		this.nombreDueno = nombre_p;
	}

	public String getNombreDueno() {
		return this.nombreDueno;
	}

	public  void setContacto(String contacto_p) {
		this.contactoDueno = contacto_p;
	}

	public String getContactoDueno() {
		return this.contactoDueno;
	}

	public void setPensionado () {

	System.out.println ("Dame nombre del dueño: ");
	setNombreDueno()

	}
}