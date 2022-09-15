package Hotel_Netherita;

public class SubMenu {

	//ATRIBUTOS
	
	private String IdMenu;
	private String nomMenu;
	
	//GETTER & SETTER 
	
	public String getIdMenu() {
		return IdMenu;
	}
	public void setIdMenu(String idMenu) {
		IdMenu = idMenu;
	}
	public String getNomMenu() {
		return nomMenu;
	}
	public void setNomMenu(String nomMenu) {
		this.nomMenu = nomMenu;
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "SubMenu [IdMenu=" + IdMenu + ", nomMenu=" + nomMenu + "]";
	}
	
}

