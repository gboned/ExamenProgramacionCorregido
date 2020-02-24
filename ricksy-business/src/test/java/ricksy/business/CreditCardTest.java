/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ricksy.business;

import org.junit.Test;


import static org.junit.Assert.*;

public class CreditCardTest {
	// Creo caso test que compruebe que la tarjeta no est� vac�a y que devuelve los atributos que se espera
    @Test 
    public void creacionCreditCard() {
        CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
        assertNotNull(abradolph);
        assertEquals("Abradolph Lincler", abradolph.getOwner());
        assertEquals("4916119711304546", abradolph.getNumber());
        
    }
    // Creo caso test para comprobar que la tarjeta de Abradolph devuelve sus datos correctos
    @Test 
    public void tarjetaAbradolphTest() {
    	CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
    	assertEquals("owner: Abradolph Lincler\nnumber: 4916119711304546\ncredit: 3000.0EZI", abradolph.tarjetaAbradolph()); 
    }
    // Creo caso test para comprobar que con el dinero que tiene Abradolph, podr�a pagar un UFO
    @Test 
    public void payTest() {
    	CreditCard abradolph = new CreditCard("Abradolph Lincler", "4916119711304546");
    	assertEquals(true, abradolph.pay(abradolph.credit));
    	
    }
    
    
}