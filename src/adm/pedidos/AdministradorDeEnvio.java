package adm.pedidos;

public abstract class AdministradorDeEnvio {

	private String nombre;
	private String legajo;
	
	public abstract void registrarEnvio();
	
	public abstract void consultarPedidocliente();
}
