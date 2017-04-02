import java.io.*;

public class Cajon {

	private String tamanio;
	private String tipo;
	private int [] numero = new int[20];

	public void setTamanio(String tamanio_p) {
		this.tamanio  = tamanio_p;
	}

	public String getTamanio() {
		return this.tamanio;
	}

	public void setTipo(String tipo_p) {
		this.tipo  = tipo_p;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setNumero(int numero_p[]) {
		this.numero  = numero_p;
	}

	public int getNumero(int i) {
		return this.numero[i];
	}

	
	
}