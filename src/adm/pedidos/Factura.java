package adm.pedidos;

import java.util.Date;

public abstract class Factura {
	
	private Integer numeroFactura;
	private Integer numeroPedido;
	private Integer codigo;
	private Date fecha;
	private String descripcion;
	private Integer cantidad;
	private double precio;
	private double total;
	
	public abstract void visualizarFactura();
	
	public abstract void imprimirFactura();
	
}
