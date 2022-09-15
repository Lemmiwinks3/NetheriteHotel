package Hotel_Netherita;

import java.util.List;

public class Ticket extends Transaccion{
	
	//SOBREESCRITURA DE METODO

	public Ticket(String idTransac, String idReser, String idPago, double totalTransac, List<Pago> pago) {
		super(idTransac, idReser, idPago, totalTransac, pago);
		// TODO Auto-generated constructor stub
	}
	

}
