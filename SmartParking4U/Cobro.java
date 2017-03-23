
public class Cobro {

	private float costoXHora;
	private float costoXFrac;

	public void setCobro () {
		costoXHora = 0;
		costoXFrac = 0;
	}


	public void setCostoXHora (float costoXHora) {
		this.costoXHora = costoXHora;
	}

	public float getCostoXHora () {
		return costoXHora;
	}

	public void setCostoXFrac (float costoXFrac) {
		this.costoXFrac = costoXFrac;
	}

	public float getCostoXFrac () {
		return costoXFrac;
	}

}