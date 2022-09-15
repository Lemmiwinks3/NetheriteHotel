package Hotel_Netherita;

public class Pago {

	//ATRIBUTOS
	
	private String idPago;
	private String nomPago;
	
	//GETTER & SETTER
	
	public String getIdPago() {
		return idPago;
	}
	public void setIdPago(String idPago) {
		this.idPago = idPago;
	}
	public String getNomPago() {
		return nomPago;
	}
	public void setNomPago(String nomPago) {
		this.nomPago = nomPago;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Pago [idPago=" + idPago + ", nomPago=" + nomPago + "]";
	}
	
	//CONSTRUCTOR
	
	public Pago(String idPago, String nomPago) {
		super();
		this.idPago = idPago;
		this.nomPago = nomPago;
	}
	
	
}
