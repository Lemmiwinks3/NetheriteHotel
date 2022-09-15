package Hotel_Netherita;

public class Permiso {

	//ATRIBUTOS
	
	private String idPerm;
	private String idRol;
	private String idOper;
	private String activoPerm;
	
	//GETTER & SETTER
	
	public String getIdPerm() {
		return idPerm;
	}
	public void setIdPerm(String idPerm) {
		this.idPerm = idPerm;
	}
	public String getIdRol() {
		return idRol;
	}
	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}
	public String getIdOper() {
		return idOper;
	}
	public void setIdOper(String idOper) {
		this.idOper = idOper;
	}
	public String getActivoPerm() {
		return activoPerm;
	}
	public void setActivoPerm(String activoPerm) {
		this.activoPerm = activoPerm;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Permiso [idPerm=" + idPerm + ", idRol=" + idRol + ", idOper=" + idOper + ", activoPerm=" + activoPerm
				+ "]";
	}
	
	//CONSTRUCTOR
	
	public Permiso(String idPerm, String idRol, String idOper, String activoPerm) {
		super();
		this.idPerm = idPerm;
		this.idRol = idRol;
		this.idOper = idOper;
		this.activoPerm = activoPerm;
	}
}

