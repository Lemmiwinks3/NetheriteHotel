package Hotel_Netherita;

import java.util.List;

public class Menu {

	//ATRIBUTOS
	
	private String idMenu;
	private String nomMenu;
	private List<SubMenu> submenu;
	//ASOCIACION - GETTER & SETTER
	
	public List<SubMenu> getSubmenu() {
		return submenu;
	}
	public void setSubmenu(List<SubMenu> submenu) {
		this.submenu = submenu;
	}
	
	public String getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(String idMenu) {
		this.idMenu = idMenu;
	}
	public String getNomMenu() {
		return nomMenu;
	}
	public void setNomMenu(String nomMenu) {
		this.nomMenu = nomMenu;
	}
	
	
}
