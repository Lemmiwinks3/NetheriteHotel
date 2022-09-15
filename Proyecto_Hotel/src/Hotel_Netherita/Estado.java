package Hotel_Netherita;

public class Estado extends Habitacion{

	//ATRIBUTOS
	
	private String idEst;
	private String nomEst;
	
	//GETTER & SETTER 	
	public String getIdEst() {
		return idEst;
	}
	public void setIdEst(String idEst) {
		this.idEst = idEst;
	}
	public String getNomEst() {
		return nomEst;
	}
	public void setNomEst(String nomEst) {
		this.nomEst = nomEst;
	}
	//TOSTRING
	@Override
	public String toString() {
		return "Estado [idEst=" + idEst + ", nomEst=" + nomEst + "]";
	}
	
	//CONSTRUCTOR
	

	public Estado(String idHabi, int numHabi, String idCateg, String idPiso, String idEst) {
		super(idHabi, numHabi, idCateg, idPiso, idEst);
		// TODO Auto-generated constructor stub
	}

}
