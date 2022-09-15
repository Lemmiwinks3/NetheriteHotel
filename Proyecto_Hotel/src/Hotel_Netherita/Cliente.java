package Hotel_Netherita;

public class Cliente {

	//ATRIBUTOS
	
	private int dniClie;
	private String nomClie;
	private String apelPatClie;
	private String apelMatClie;
	private String emailClie;
	private int telefClie;
	
	//GETTER & SETTER
	
	
	public String getNomClie() {
		return nomClie;
	}
	public int getDniClie() {
		return dniClie;
	}
	public void setDniClie(int dniClie) {
		this.dniClie = dniClie;
	}
	public void setNomClie(String nomClie) {
		this.nomClie = nomClie;
	}
	public String getApelPatClie() {
		return apelPatClie;
	}
	public void setApelPatClie(String apelPatClie) {
		this.apelPatClie = apelPatClie;
	}
	public String getApelMatClie() {
		return apelMatClie;
	}
	public void setApelMatClie(String apelMatClie) {
		this.apelMatClie = apelMatClie;
	}
	public String getEmailClie() {
		return emailClie;
	}
	public void setEmailClie(String emailClie) {
		this.emailClie = emailClie;
	}
	public int getTelefClie() {
		return telefClie;
	}
	public void setTelefClie(int telefClie) {
		this.telefClie = telefClie;
	}
	//TOSTRING
	
	@Override
	public String toString() {
		return "Cliente [dniClie=" + dniClie + ", nomClie=" + nomClie + ", apelPatClie=" + apelPatClie
				+ ", apelMatClie=" + apelMatClie  + ", emailClie=" + emailClie + ", telefClie="
				+ telefClie + "]";
	}
	
	//CONSTRUCTOR
	
	public Cliente(int dniClie, String nomClie, String apelPatClie, String apelMatClie, String emailClie,
			int telefClie) {
		super();
		this.dniClie = dniClie;
		this.nomClie = nomClie;
		this.apelPatClie = apelPatClie;
		this.apelMatClie = apelMatClie;
		this.emailClie = emailClie;
		this.telefClie = telefClie;
	}
}
