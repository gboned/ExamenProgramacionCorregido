package ricksy.business;

public class CreditCard {
		// A�ado los atributos a la clase
		public String owner = null;
		public String number = null;
		public double credit = 3000.0;
		public String symbol = "EZI";
		// A�ado el constructor a la clase
		public CreditCard(String owner, String number) {
		
			this.owner = owner;
			this.number = number;
		
		// A continuaci�n, a�ado m�todos get para que me devuelvan los atributos
		}
		
		public String getOwner() {
			return this.owner;
		}
		
		public String getNumber() {
			return this.number;
		}
		
		public double getCredit() {
			return this.credit;
		}
		
		public String getSymbol() {
			return this.symbol;
		}
		// Creo el m�todo toString para imprimir por pantalla los datos
		public String toString() {
			return "owner: " + getOwner() + "\nnumber: " + getNumber() + "\ncredit: " + getCredit() + getSymbol();
		}
		// Con este m�todo se comprueba si se puede pagar con el dinero actual un nuevo UFO
		public boolean pay(double credit) {
			if (this.credit >= 500) {
				return true;
			}
			return false;
		}
}
