package Hotel_Netherita;

import java.util.List;

public class Transaccion {
	
	//ATRIBUTOS
	
	private String idTransac;
	private String idReser;
	private String idPago;
	private double totalTransac;
	private List<Pago> pago;

	//ASOCIACION - GETTER & SETTER
	
	public List<Pago> getPago() {
		return pago;
	}
	public void setPago(List<Pago> pago) {
		this.pago = pago;
	}
	
	//GETTER & SETTER
	public String getIdTransac() {
		return idTransac;
	}
	
	public void setIdTransac(String idTransac) {
		this.idTransac = idTransac;
	}
	public String getIdReser() {
		return idReser;
	}
	public void setIdReser(String idReser) {
		this.idReser = idReser;
	}
	public String getIdPago() {
		return idPago;
	}
	public void setIdPago(String idPago) {
		this.idPago = idPago;
	}
	public double getTotalTransac() {
		return totalTransac;
	}
	public void setTotalTransac(double totalTransac) {
		this.totalTransac = totalTransac;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Transaccion [idTransac=" + idTransac + ", idReser=" + idReser + ", idPago=" + idPago + ", totalTransac="
				+ totalTransac + ", pago=" + pago + "]";
	}
	
	//CONSTRUCTOR
	
	public Transaccion(String idTransac, String idReser, String idPago, double totalTransac, List<Pago> pago) {
		super();
		this.idTransac = idTransac;
		this.idReser = idReser;
		this.idPago = idPago;
		this.totalTransac = totalTransac;
		this.pago = pago;
	}
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}
}
