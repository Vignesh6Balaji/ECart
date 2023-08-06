package Cart;
import java.util.Scanner;
public class CartView {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ItemController ic=new ItemController();
		System.out.println("Welcome to ECart Application...");
		boolean b=true;
		char c='y';
		while(b||c=='y'||c=='Y') {
			System.out.println("Enter 1 for Add items in cart");
			System.out.println("Enter 2 for Remove items in cart");
			System.out.println("Enter 3 for Search items in cart");
			System.out.println("Enter 4 for Calculate total price in cart");
			System.out.println("Enter 5 for Display all the items present in cart");
			System.out.println("Enter your choice :");
			int ch=s.nextInt();
			switch(ch) {
			case 1:{
				ic.addItem(createItem());
				System.out.println("Item added to cart successfully!!!");
			}break;
			case 2:ic.removeItem(createItem());
			break;
			case 3:ic.containsItem(createItem());
			break;
			case 4:ic.calculateTotalPrice();
			break;
			case 5:ic.displayItems();
			break;
			default :System.out.println("Please enter the proper choice");
			}
			System.out.println("Do you want to continue??");
			System.out.println("If yes type y or if no type n");
			c=s.next().charAt(0);
			b=false;
		}
	}
	
	public static Items createItem() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the item id :");
		int id=s.nextInt();
		System.out.println("Enter the item name :");
		String name=s.next();
		System.out.println("Enter the item price :");
		double price=s.nextDouble();
		return new Items(id,name,price);
	}

}
