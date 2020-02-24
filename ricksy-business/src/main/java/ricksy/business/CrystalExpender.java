package ricksy.business;

public class CrystalExpender {
	
	public int stock = 0;
	public int itemCost = 50;
	
	public CrystalExpender(int stock, int itemCost) {
		
		this.stock = stock;
		this.itemCost = itemCost;
		
	}
	public int getStock() {
		return this.stock;
	}
	
	public int getItemCost() {
		return this.itemCost;
	}
	
	public String toString() {
		return "\nPacks\n" + 
                "=====";
	}
}
