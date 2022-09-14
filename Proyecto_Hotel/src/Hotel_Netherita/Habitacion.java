package Hotel_Netherita;

public class Habitacion {

	//ATRIBUTOS
	
	protected String idHabi;
	protected int numHabi;
	protected String idCateg;
	protected String idPiso;
	protected String idEst;
	
	//GETTER & SETTER
	
	public String getIdHabi() {
		return idHabi;
	}
	public void setIdHabi(String idHabi) {
		this.idHabi = idHabi;
	}
	public int getNumHabi() {
		return numHabi;
	}
	public void setNumHabi(int numHabi) {
		this.numHabi = numHabi;
	}
	public String getIdCateg() {
		return idCateg;
	}
	public void setIdCateg(String idCateg) {
		this.idCateg = idCateg;
	}
	public String getIdPiso() {
		return idPiso;
	}
	public void setIdPiso(String idPiso) {
		this.idPiso = idPiso;
	}
	public String getIdEst() {
		return idEst;
	}
	public void setIdEst(String idEst) {
		this.idEst = idEst;
	}
	
	//CONSTRUCTOR
	
	public Habitacion(String idHabi, int numHabi, String idCateg, String idPiso, String idEst) {
		super();
		this.idHabi = idHabi;
		this.numHabi = numHabi;
		this.idCateg = idCateg;
		this.idPiso = idPiso;
		this.idEst = idEst;
	}
	
	
}
