package adm.pedidos;

import java.util.Date;

public class TarjetaCredito {
	
	private String nombre;
	private Integer nro;
	private Date fechaVencimiento;
	private String financiera;
	private String tipo;
	private Double limite;
	private Double saldo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNro() {
		return nro;
	}
	public void setNro(Integer nro) {
		this.nro = nro;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getFinanciera() {
		return financiera;
	}
	public void setFinanciera(String financiera) {
		this.financiera = financiera;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
