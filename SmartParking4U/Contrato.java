import java.io.*;

public class Contrato {

	private String fechaContra;
	private String fechaVenci;

	public void setFechaContra(String fechaContra_p) {
		this.fechaContra = fechaContra_p;
	}

	public String getFechaContra() {
		return this.fechaContra;
	}

	public void setFechaVenci(String fechaVenci_p) {
		this.fechaVenci = fechaVenci_p;
	}

	public String getFechaVenci() {
		return this.fechaVenci;
	}
}