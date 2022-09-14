package Hotel_Netherita;

public class Piso extends Habitacion{

	//ATRIBUTOS
	
	private String idPiso;
	private String numPiso;
	
	//GETTER & SETTER
	
	public String getIdPiso() {
		return idPiso;
	}
	public void setIdPiso(String idPiso) {
		this.idPiso = idPiso;
	}
	public String getNumPiso() {
		return numPiso;
	}
	public void setNumPiso(String numPiso) {
		this.numPiso = numPiso;
	}
	
	//CONSTRUCTOR
	
	public Piso(String idHabi, int numHabi, String idCateg, String idPiso, String idEst, String idPiso2,
			String numPiso) {
		super(idHabi, numHabi, idCateg, idPiso, idEst);
		idPiso = idPiso2;
		this.numPiso = numPiso;
	}
}
