package ricksy.business;

import static org.junit.Assert.*;

import org.junit.Test;

public class CrystalExpenderTest {

	@Test
	public void crearCrystalExpender() {
		CrystalExpender packExpender = new CrystalExpender(3, 50);
		assertEquals(3, packExpender.getStock());
		assertEquals(50, packExpender.getItemCost());
	}
	
	@Test
	public void toStringTest() {
		CrystalExpender packExpender = new CrystalExpender(3, 50);
		assertEquals("\nPacks\n" + "=====", packExpender.toString());
	}

}

