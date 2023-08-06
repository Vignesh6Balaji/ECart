package Cart;
import java.util.HashSet;
import java.util.Set;
public class ItemController {
	private Set<Items> cartItems=new HashSet<>();
	
	public void addItem(Items item) {
		cartItems.add(item);
	}
	public void removeItem(Items item) {
		if(cartItems.remove(item)) {
			System.out.println("Item removed from the cart");
		}
		else
			System.out.println("Item is not present in the cart");
	}
	
	public void containsItem(Items item) {
		if(cartItems.contains(item)) {
			System.out.println("The item is present in cart");
		}
		else
			System.out.println("The item is not present in the cart");
	}
	
	public void calculateTotalPrice() {
		double totalPrice=0;
		for(Items item: cartItems)
			totalPrice+=item.getPrice();
		
		System.out.println("The total items price is : "+totalPrice);
	}
	
	public void displayItems() {
		for(Items item: cartItems)
			System.out.println(item.getItemid()+" "+item.getItemName()+" "+item.getPrice());
	}
}
