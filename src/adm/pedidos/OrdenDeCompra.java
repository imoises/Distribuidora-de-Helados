package adm.pedidos;

public abstract class OrdenDeCompra {
	
	private double numeroDeOrden;
	private String tipoPriveedor;
	private String nombreProveedor;
	private double codigoInterno;
	private double precioTotal;
	
	public abstract void imprimit();
	
	public abstract void calcularPrecio();
}
