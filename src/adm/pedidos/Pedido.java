package adm.pedidos;

import java.util.Date;

public abstract class Pedido {
	private Integer numeroPedido;
	private Integer cantidad;
	private Date fecha;
	private Integer precioTotal;
	private double precio;
	
	public abstract void consultarPedido();
	
	public abstract void cancelarPedido();
	
	public abstract void confirmarPedido();
	
	public abstract void modificarPedido();
	
	public abstract void calcularPrecioTotal();
	
}
