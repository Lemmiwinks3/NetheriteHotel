package Hotel_Netherita;

public class Asistencia {

	//ATRIBUTOS
	
	private String idAsist;
	private int dniUser;
	private String fechEntradaAsist;
	private String fechSalidaAsist;
	
	//GETTER & SETTER
	
	public String getIdAsist() {
		return idAsist;
	}
	public void setIdAsist(String idAsist) {
		this.idAsist = idAsist;
	}
	public int getDniUser() {
		return dniUser;
	}
	public void setDniUser(int dniUser) {
		this.dniUser = dniUser;
	}
	public String getFechEntradaAsist() {
		return fechEntradaAsist;
	}
	public void setFechEntradaAsist(String fechEntradaAsist) {
		this.fechEntradaAsist = fechEntradaAsist;
	}
	public String getFechSalidaAsist() {
		return fechSalidaAsist;
	}
	public void setFechSalidaAsist(String fechSalidaAsist) {
		this.fechSalidaAsist = fechSalidaAsist;
	}
	@Override
	
	//TOSTRING
	
	public String toString() {
		return "Asistencia [idAsist=" + idAsist + ", dniUser=" + dniUser + ", fechEntradaAsist=" + fechEntradaAsist
				+ ", fechSalidaAsist=" + fechSalidaAsist + "]";
	}
	
	//CONSTRUCTOR
	
	public Asistencia(String idAsist, int dniUser, String fechEntradaAsist, String fechSalidaAsist) {
		super();
		this.idAsist = idAsist;
		this.dniUser = dniUser;
		this.fechEntradaAsist = fechEntradaAsist;
		this.fechSalidaAsist = fechSalidaAsist;
	}
}
