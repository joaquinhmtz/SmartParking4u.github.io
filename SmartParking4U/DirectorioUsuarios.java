public class DirectorioUsuarios {

	private Usuario operador=new Usuario("operador1", "1234");
	private Usuario gerente=new Usuario( "administrador", "presto");
	private Lector tomaDato=new Lector();


	public int iniciarSesion () {

		String nombre=" ";
		String contrasena=" ";
		int valor=-1;

		System.out.println(" ");
		System.out.print("Dame el usuario: ");
		nombre=tomaDato.leeCadena();

		System.out.print("Dame la contrasena: ");
		contrasena=tomaDato.leeCadena();
			
		if (operador.getUsuario().compareTo(nombre)==0){
			if(operador.getContrasena().compareTo(contrasena)==0){
				valor=1;
			} else
				valor=-1;
		}

		if (gerente.getUsuario().compareTo(nombre)==0){
			if(gerente.getContrasena().compareTo(contrasena)==0){
				valor=2;
			} else
				valor=-1;
		}

		return valor;

	}	
	
}