package Cart;
import java.util.Objects;
public class Items {
	private int itemid;
	private String itemName;
	private double price;
	
	public Items(int itemid, String itemName, double price) {
		this.itemid = itemid;
		this.itemName = itemName;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(itemName, itemid, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.itemid == ((Items)obj).itemid||this.itemName==((Items)obj).itemName||this.price==((Items)obj).price)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Items [itemid=" + itemid + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	public int getItemid() {
		return itemid;
	}
	
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
