public class Estacionamiento {

	private int [] estacionamiento = new int [30];

	public void setLugar(int estacionamiento_p[]) {
		int i = 0;
		this.estacionamiento[i]  = estacionamiento_p[i];
	}

	public int getLugar() {
		int i = 0;
		return this.estacionamiento[i];
	}
	
}