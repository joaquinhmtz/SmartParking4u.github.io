public class Tarifa {

	private float tarifaPensionadoMes;
    private float tarifaPensionadoSemana;
    private float tarifaHora;
    private Lector leeDatos=new Lector();


    public Tarifa () {
        this.tarifaPensionadoMes=850.00f;
        this.tarifaPensionadoSemana=350.00f;
        this.tarifaHora=22.00f;
    }

    public void setTarifaPensionadoMes() {
        float aux=0;
        System.out.print("Teclea la tarifa pension del mes: ");
        aux=leeDatos.leeFloat();
        if (aux>0)
            this.tarifaPensionadoMes = aux;
    }
    
    public float getTarifaPensionadoMes() {
        return tarifaPensionadoMes;
    }
   
    public void setTarifaPensionadoSemana() {
        float aux=0;
        System.out.print("Teclea la tarifa de la semana: ");
        aux=leeDatos.leeFloat();
        if (aux>0)
            this.tarifaPensionadoSemana = aux;
    }

    public float getTarifaPensionadoSemana() {
        return tarifaPensionadoSemana;
    }

    public void setTarifaHora() {
        float aux=0;
        System.out.print("Teclea la tarifa por hora: ");
        aux=leeDatos.leeFloat();
        if (aux>0)
            this.tarifaHora = aux;
    }

    public float getTarifaHora() {
        return tarifaHora;
    }
}