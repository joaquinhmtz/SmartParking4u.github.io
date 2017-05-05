public class DirectorioUsuarios {

	private Usuario operador;
	private Lector tomaDato=new Lector();

	public DirectorioUsuarios () {
		operador =new Usuario("Operador1", "presto");
	}

	public boolean iniciarSesion () {


		boolean valor = false;
		String nombre=" ";
		String contrasena=" ";

		System.out.println(" ");
		System.out.print("Dame el usuario: ");
		nombre=tomaDato.leeCadena();

		System.out.print("Dame la contrasena: ");
		contrasena=tomaDato.leeCadena();
		if ((operador.getUsuario().compareTo(nombre)==0) && (operador.getContrasena().compareTo(contrasena)==0)) {
			valor= true;
		} else{	
			valor= false ;			
			System.out.println ("El usuario o la contraseña no coinciden. \n");
			
		} 
		return valor;
	}	
	
}
