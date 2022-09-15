package Hotel_Netherita;

public class Reserva {

	//ATRIBUTOS
	
	private int dniClie;
	private int dniEncar;
	private	String idCateg;
	private String idServ;
	private String fechReser;
	private String descripReser;
	
	//GETTER & SETTER
	
	public int getDniClie() {
		return dniClie;
	}
	public void setDniClie(int dniClie) {
		this.dniClie = dniClie;
	}
	public int getDniEncar() {
		return dniEncar;
	}
	public void setDniEncar(int dniEncar) {
		this.dniEncar = dniEncar;
	}
	public String getIdCateg() {
		return idCateg;
	}
	public void setIdCateg(String idCateg) {
		this.idCateg = idCateg;
	}
	public String getIdServ() {
		return idServ;
	}
	public void setIdServ(String idServ) {
		this.idServ = idServ;
	}
	public String getFechReser() {
		return fechReser;
	}
	public void setFechReser(String fechReser) {
		this.fechReser = fechReser;
	}
	public String getDescripReser() {
		return descripReser;
	}
	public void setDescripReser(String descripReser) {
		this.descripReser = descripReser;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Reserva [dniClie=" + dniClie + ", dniEncar=" + dniEncar + ", idCateg=" + idCateg + ", idServ=" + idServ
				+ ", fechReser=" + fechReser + ", descripReser=" + descripReser + "]";
	}
	
	//CONSTRUCTOR
	
	public Reserva(int dniClie, int dniEncar, String idCateg, String idServ, String fechReser, String descripReser) {
		super();
		this.dniClie = dniClie;
		this.dniEncar = dniEncar;
		this.idCateg = idCateg;
		this.idServ = idServ;
		this.fechReser = fechReser;
		this.descripReser = descripReser;
	}
}
