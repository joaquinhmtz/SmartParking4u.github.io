public class Caja {

	private float dineroEnCaja;
	private Lector lecturaDatos=new Lector();

	private void setIngresaRemesa(){
		float ingresaRemesa=0;		
		System.out.print("Dame el  monto a ingresar: ");
		ingresaRemesa=lecturaDatos.leeFloat();
		this.dineroEnCaja= this.dineroEnCaja+ingresaRemesa;
	}

	private void setEgresaRemesa(){
		float egresaRemesa=0;
		System.out.print("Dame el monto a retirar: ");
		egresaRemesa=lecturaDatos.leeFloat();
		this.dineroEnCaja=this.dineroEnCaja-egresaRemesa;
	}

	public void setIngresos(float montoACobrar){
		float cambio=0;
		System.out.print("Con cuanto paga el cliente:");
		cambio=lecturaDatos.leeFloat()-montoACobrar;
		System.out.println("Su cambio es: " + cambio);
		this.dineroEnCaja=this.dineroEnCaja+montoACobrar;
	}

	public double getdineroEnCaja(){
		return this.dineroEnCaja;
	}

}