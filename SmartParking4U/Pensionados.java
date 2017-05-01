public class Pensionados {

	private String nombreDueno;
	private String contactoDueno;
	private Coche auto;
	private Lector reader;

	public Pensionados () {

		nombreDueno = "Desconocido";
		contactoDueno = "Desconocido";
		auto = new Coche ();
		reader = new Lector ();
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

	public void pimpPensionado () {

		System.out.println ("Dame nombre del dueño: ");
		setNombreDueno(reader.leeCadena ());
		System.out.println ("Dame el contacto del dueño: ");
		setContacto (reader.leeCadena());
		System.out.println ("Dame la placa del coche:");
		auto.setPlaca(reader.leeCadena());
		System.out.println ("Dame la marca del coche:");
		auto.setMarca(reader.leeCadena());

	}

	public void imprimePimpPensionado () {

		System.out.println ("El nombre del dueño es: " + getNombreDueno () + "\n"+
		"El contacto del dueño es: " +  getContactoDueno () + "\n"+
		"La placa del coche es: " + auto.getPlaca() + "\n"+
		"La marca del coche es: " + auto.getMarca() + "\n");

	}
}