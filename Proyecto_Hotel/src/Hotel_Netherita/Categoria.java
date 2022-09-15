package Hotel_Netherita;

public class Categoria {

	//ATRIBUTOS
	
	private String idCateg;
	private String nomCateg;
	private String descripCateg;
	private String precCateg;
	
	//GETTER & SETTER
	
	public String getIdCateg() {
		return idCateg;
	}
	public void setIdCateg(String idCateg) {
		this.idCateg = idCateg;
	}
	public String getNomCateg() {
		return nomCateg;
	}
	public void setNomCateg(String nomCateg) {
		this.nomCateg = nomCateg;
	}
	public String getDescripCateg() {
		return descripCateg;
	}
	public void setDescripCateg(String descripCateg) {
		this.descripCateg = descripCateg;
	}
	public String getPrecCateg() {
		return precCateg;
	}
	public void setPrecCateg(String precCateg) {
		this.precCateg = precCateg;
	}
	
	// TOSTRING 
	
	@Override
	public String toString() {
		return "Categoria [idCateg=" + idCateg + ", nomCateg=" + nomCateg + ", descripCateg=" + descripCateg
				+ ", precCateg=" + precCateg + ", getIdCateg()=" + getIdCateg() + ", getNomCateg()=" + getNomCateg()
				+ ", getDescripCateg()=" + getDescripCateg() + ", getPrecCateg()=" + getPrecCateg() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	//CONSTRUCTOR
	
	public Categoria(String idCateg, String nomCateg, String descripCateg, String precCateg) {
		super();
		this.idCateg = idCateg;
		this.nomCateg = nomCateg;
		this.descripCateg = descripCateg;
		this.precCateg = precCateg;
	}
}
