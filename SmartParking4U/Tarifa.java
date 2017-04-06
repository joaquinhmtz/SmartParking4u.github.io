public class Tarifa {

	    float tarifaPensionadoMes;
        float tarifaPensionadoDia;
        float tarifaPensionadoSemana;
        float tarifaHora;
        float tarifaQuinceMin;

    public Tarifa () {
        this.tarifaPensionadoMes=850.00;
        this.tarifaPensionadoDia=150.00;
        this.tarifaPensionadoSemana=350.00;
        this.tarifaHora=22.00;
        this.tarifaQuinceMin=15.00;
    }

    public float getTarifaPensionadoMes() {
        return tarifaPensionadoMes;
    }

    public void setTarifaPensionadoMes(float tarifaPensionadoMes) {
        this.tarifaPensionadoMes = tarifaPensionadoMes;
    }

    public float getTarifaPensionadoDia() {
        return tarifaPensionadoDia;
    }

    public void setTarifaPensionadoDia(float tarifaPensionadoDia) {
        this.tarifaPensionadoDia = tarifaPensionadoDia;
    }

    public float getTarifaPensionadoSemana() {
        return tarifaPensionadoSemana;
    }

    public void setTarifaPensionadoSemana(float tarifaPensionadoSemana) {
        this.tarifaPensionadoSemana = tarifaPensionadoSemana;
    }

    public float getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(float tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public float getTarifaQuinceMin() {
        return tarifaQuinceMin;
    }

    public void setTarifaQuinceMin(float tarifaQuinceMin) {
        this.tarifaQuinceMin = tarifaQuinceMin;
    }

}