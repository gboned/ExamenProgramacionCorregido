package ricksy.business;
import ricksy.business.CreditCard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UfosPark{
	// Añado los atributos de la clase y sus valores iniciales
	public double fee = 500;
	public HashMap<String, String> flota = new HashMap<String, String>();
	private String[] ufosID = new String[2];
	// Creo el constructor de la clase
	UfosPark ufosPark = new UfosPark();
	
	public double getFee() {
		return this.fee;
	}
	
	public HashMap<String, String> getFlota() {
		return this.flota;
	}
	
	public String[] getUfosID() {
		return this.ufosID;
	}
	// Creo el método para añadir los ovnis, que los obtiene de la clase Ufos
	public void add(String ovni) {
		for (Map.Entry<String, String> flota : flota.entrySet()) {
			if (flota == null)
				ufosPark.add(ovni);
		}
	}

	public void dispatch() {
		
	}
	
	
}

