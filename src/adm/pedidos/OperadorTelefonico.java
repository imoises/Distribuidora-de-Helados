package adm.pedidos;

public abstract class OperadorTelefonico {
	
	private String nombre;
	private String legajo;
	
	public abstract void registrarPedido();
	
	public abstract void generarFactura();
}
