package adm.pedidos;

public class Factura {
	
	private Integer numeroFactura;
	private Integer numeroPedido;
	private Integer codigo;
	private String descripcion;
	private Integer cantidad;
	private double precio;
	private double total;
	
	public void calcularTotal(){
		total=precio*cantidad;
	}
}
