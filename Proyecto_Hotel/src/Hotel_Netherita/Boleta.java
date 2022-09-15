package Hotel_Netherita;

import java.util.List;

public class Boleta extends Transaccion{
	
	//SOBREESCRITURA DE METODO
	
	public Boleta(String idTransac, String idReser, String idPago, double totalTransac, List<Pago> pago) {
		super(idTransac, idReser, idPago, totalTransac, pago);
		// TODO Auto-generated constructor stub
	}
		@Override
		public void imprimir() {
	
			{
				System.out.println("Imprimiendo boleta");
			}
		}
	
}

