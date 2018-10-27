package adm.pedidos;

import java.util.Date;

public abstract class Remito {

	private String nombre;
	private String numeroDeRemito;
	private Date fecha;
	private Integer numeroDePedido;
	private Double precio;
	private Integer cantidad;
	private Integer codigoInternoProducto;
	
	public abstract void generarRemito();
	
	public abstract void imprimirRemito();
}
