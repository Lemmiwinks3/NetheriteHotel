package Hotel_Netherita;

public class Servicio {

	//ATRIBUTOS
	
	private String idServ;
	private String nomServ;
	private double precServ;
	private String descripServ;
	
	//GETTER & SETTER
	
	public String getIdServ() {
		return idServ;
	}
	public void setIdServ(String idServ) {
		this.idServ = idServ;
	}
	public String getNomServ() {
		return nomServ;
	}
	public void setNomServ(String nomServ) {
		this.nomServ = nomServ;
	}
	public double getPrecServ() {
		return precServ;
	}
	public void setPrecServ(double precServ) {
		this.precServ = precServ;
	}
	public String getDescripServ() {
		return descripServ;
	}
	public void setDescripServ(String descripServ) {
		this.descripServ = descripServ;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Servicio [idServ=" + idServ + ", nomServ=" + nomServ + ", precServ=" + precServ + ", descripServ="
				+ descripServ + "]";
	}
	
	//CONSTRUCTOR
	
	public Servicio(String idServ, String nomServ, double precServ, String descripServ) {
		super();
		this.idServ = idServ;
		this.nomServ = nomServ;
		this.precServ = precServ;
		this.descripServ = descripServ;
	}
	
}
