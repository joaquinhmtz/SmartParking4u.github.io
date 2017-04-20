public class Contrato {
	
	private int dia;
	private int mes;
	private int anio;

	Lector reader = new Lector();

	public void Menu() {
		System.out.println("Eliga su plan de contrato: ");
		System.out.println("1.- Por día");
		System.out.println("2.- Por mes");
		System.out.println("3.- Por año");
		System.out.println("-----------------------------");
	}

	public void Menu(int opcion) {
		this.Menu();

		switch(reader.leeInt()) {

			case 1:
			System.out.println("Eligió el plan por día.");
			System.out.println("¿Por cuántos días quiere el contrato?");
			reader.leeInt();
			break;

			case 2:
			System.out.println("Eligió el plan por mes.");
			System.out.println("¿Por cuántos meses quiere el contrato?");
			reader.leeInt();
			break;

			case 3:
			System.out.println("Eligió el plan por año.");
			System.out.println("¿Por cuántos años quiere el contrato?");
			reader.leeInt();
			break;
		}
	}
}