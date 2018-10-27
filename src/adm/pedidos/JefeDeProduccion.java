package adm.pedidos;

public abstract class JefeDeProduccion {

	private String nombre;
	private String legajo;
	
	public abstract void registrarProducto();
	public abstract void consultarProducto();
	public abstract void modificarProducto();
	public abstract void eliminarProducto();
}
