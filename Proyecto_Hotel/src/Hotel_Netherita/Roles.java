package Hotel_Netherita;

public class Roles {

	//ATRIBUTOS
	
	private String codRoles;
	private String nomRol;
	
	//GETTER & SETTER
	
	public String getCodRoles() {
		return codRoles;
	}
	public void setCodRoles(String codRoles) {
		this.codRoles = codRoles;
	}
	public String getNomRol() {
		return nomRol;
	}
	public void setNomRol(String nomRol) {
		this.nomRol = nomRol;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Roles [codRoles=" + codRoles + ", nomRol=" + nomRol + "]";
	}
	
	//CONSTRUCTOR
	
	public Roles(String codRoles, String nomRol) {
		super();
		this.codRoles = codRoles;
		this.nomRol = nomRol;
	}
	
}
