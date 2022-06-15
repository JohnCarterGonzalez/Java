import java.util.ArrayList;
import java.util.List;

public class BaristaTest {
	public static void main(String[] args) {
		//Menu Items
		Item item1 = new Item("Coffee", 1.50);
		Item item2 = new Item("Mocha", 4.25);
		Item item3 = new Item("Latte", 3.75);
		Item item4 = new Item("Cappuccino", 3.50);

		//Create 2 orders for unspecified guests
		Order order1 = new Order();
		Order order2 = new Order();
		
		//Create 3 Orders using the overloaded constructor to give each a name for the order
		Order order3 = new Order("Michelle");
		Order order4 = new Order("Lana");
		Order order5 = new Order("Bob");

		//add 2 items to each of the orders using the addItem method
		order1.addItem(item1);
		order1.addItem(item2);

		order2.addItem(item3);
		order2.addItem(item4);

		order3.addItem(item1);
		order3.addItem(item2);
		
		order4.addItem(item3);
		order4.addItem(item4);

		order5.addItem(item1);
		order5.addItem(item2);

		//Test the results and the display method by calling the display method on all orders
		order1.display();
		order2.display();
		order3.display();
		order4.display();
		order5.display();

		//test getStatusMessage, set some orders to ready and printing the messagges for each order
		order1.setReady(true);

		System.out.println(order1.getStatusMessage());
		System.out.println(order2.getStatusMessage());
		
		System.out.println(order1.getOrderTotal());

	}	







}


