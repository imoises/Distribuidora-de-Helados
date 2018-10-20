package adm.pedidos;

public class OrdenDeCompra {
	
	private double numeroDeOrden;
	private String tipoPriveedor;
	private String nombreProveedor;
	private double codigoInterno;
	public double getNumeroDeOrden() {
		return numeroDeOrden;
	}
	public void setNumeroDeOrden(double numeroDeOrden) {
		this.numeroDeOrden = numeroDeOrden;
	}
	public String getTipoPriveedor() {
		return tipoPriveedor;
	}
	public void setTipoPriveedor(String tipoPriveedor) {
		this.tipoPriveedor = tipoPriveedor;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public double getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(double codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	
	
}
