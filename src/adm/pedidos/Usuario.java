package adm.pedidos;

public abstract class Usuario {
	private String usuario;
	private String contraseņa;
	
	public abstract void registrar();
	
	public abstract void iniciarSecion();
}
