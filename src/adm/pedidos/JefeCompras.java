package adm.pedidos;

public abstract class JefeCompras {
	
	private String usuario;
	private String contraseña;
	
	public abstract void registrarOrdenDeConpra();
	public abstract void consultarOrdenDeConpra();
	public abstract void modificarOrdenDeConpra();
	public abstract void candelarOrdenDeConpra();
	public abstract void registrarInsumo();
	public abstract void consultarInsumo();
	public abstract void modificarInsumo();
	public abstract void eliminarInsumo();
	
}
