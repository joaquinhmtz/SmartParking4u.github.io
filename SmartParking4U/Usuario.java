public class Usuario {

	private String usuario;
	private String contrasena;

	public Usuario (String usuario_param, String contrasena_param){
		this.usuario=usuario_param;
		this.contrasena=contrasena_param;
	}

	public void setUsuario(String usuario_param){
		this.usuario=usuario_param;
	}

	public String getUsuario(){
		return this.usuario;
	}
	
	public void setContrasena(String contrasena_param){
		this.contrasena=contrasena_param;
	}

	public String getContrasena(){
		return this.contrasena;
	}
}