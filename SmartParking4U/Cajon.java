import java.io.*;

public class Cajon {

	private String tamanio;
	private String tipo;
	private int [] lugar = new int[20];

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


    public void setLugar(int lugar_p[]) {
    	int i = 0;
        this.lugar[i]  = lugar_p[i];
    }

    public int getLugar() {
    	int i = 0;
        return this.lugar[i];
    }
	
}