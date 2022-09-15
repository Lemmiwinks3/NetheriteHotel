package Hotel_Netherita;

public class Encargado {

	//ATRIBUTOS
	
	private int dniEncar;
	private String nomEncar;
	private String apelPatEncar;
	private String apelMarEncar;
	private String codRol;
	private String emailEncar;
	private int telefEncar;
	private String passwordEncar;
	
	//GETTER & SETTER
	
	public int getDniEncar() {
		return dniEncar;
	}
	public void setDniEncar(int dniEncar) {
		this.dniEncar = dniEncar;
	}
	public String getNomEncar() {
		return nomEncar;
	}
	public void setNomEncar(String nomEncar) {
		this.nomEncar = nomEncar;
	}
	public String getApelPatEncar() {
		return apelPatEncar;
	}
	public void setApelPatEncar(String apelPatEncar) {
		this.apelPatEncar = apelPatEncar;
	}
	public String getApelMarEncar() {
		return apelMarEncar;
	}
	public void setApelMarEncar(String apelMarEncar) {
		this.apelMarEncar = apelMarEncar;
	}
	public String getCodRol() {
		return codRol;
	}
	public void setCodRol(String codRol) {
		this.codRol = codRol;
	}
	public String getEmailEncar() {
		return emailEncar;
	}
	public void setEmailEncar(String emailEncar) {
		this.emailEncar = emailEncar;
	}
	public int getTelefEncar() {
		return telefEncar;
	}
	public void setTelefEncar(int telefEncar) {
		this.telefEncar = telefEncar;
	}
	public String getPasswordEncar() {
		return passwordEncar;
	}
	public void setPasswordEncar(String passwordEncar) {
		this.passwordEncar = passwordEncar;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Encargado [dniEncar=" + dniEncar + ", nomEncar=" + nomEncar + ", apelPatEncar=" + apelPatEncar
				+ ", apelMarEncar=" + apelMarEncar + ", codRol=" + codRol + ", emailEncar=" + emailEncar
				+ ", telefEncar=" + telefEncar + ", passwordEncar=" + passwordEncar + "]";
	}
	
	//CONSTRUCTOR
	
	public Encargado(int dniEncar, String nomEncar, String apelPatEncar, String apelMarEncar, String codRol,
			String emailEncar, int telefEncar, String passwordEncar) {
		super();
		this.dniEncar = dniEncar;
		this.nomEncar = nomEncar;
		this.apelPatEncar = apelPatEncar;
		this.apelMarEncar = apelMarEncar;
		this.codRol = codRol;
		this.emailEncar = emailEncar;
		this.telefEncar = telefEncar;
		this.passwordEncar = passwordEncar;
	}
}
