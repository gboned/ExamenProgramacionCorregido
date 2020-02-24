package ricksy.business;
import ricksy.business.CreditCard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UfosPark{
	// Añado los atributos de la clase y sus valores iniciales
	public double fee = 500;
	public HashMap<Ufos, Ufos> flota = new HashMap<Ufos, Ufos>();
	private String[] ufosID = new String[2];
	// Creo el constructor de la clase
	public UfosPark() {
		this.fee = fee;
		this.flota = flota;
		this.ufosID = ufosID;
	}
	// Creo el método para añadir los ovnis, que los obtiene de la clase Ufos
	public void add(String Ufos) {
		for (Map.Entry<Ufos, Ufos> entry : flota.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

	public void dispatch() {
		
	}
	
	
}

