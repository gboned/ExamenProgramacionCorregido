package ricksy.business;
import ricksy.business.CreditCard;
import java.util.ArrayList;

public class UfosPark{
	// Añado los atributos de la clase y sus valores iniciales
	public double fee = 500;
	public ArrayList<Ufos> flota = null;
	// Creo el constructor de la clase
	public UfosPark() {

	}
	// Creo el método para añadir los ovnis, que los obtiene de la clase Ufos
	public void add(String ovni) {
		for (Ufos i : this.flota) {
			this.flota.add(i);
		}
	}

	public void dispatch() {
		
	}
	
	
}

