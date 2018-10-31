package adm.pedidos;

public abstract class Proveedor {
	
	private String razonSocial;
	private String cuit;
	private Integer telefono;
	private Integer codigoInterno;
	
	public abstract void registrarProveedor();	
	public abstract void consultarProveedor();	
	public abstract void modificarProveedor();	
	public abstract void eliminarProveedor();	
}


