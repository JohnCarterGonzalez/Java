import java.util.ArrayList;

public class OrderKiosk {

    /**
     * Member Variables
     * ArrayList<Item> menu;
     * ArrayList<Item> orders;
     * 
     */
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Item> orders = new ArrayList<Item>();

    /**
     * Constructor
     * initializes the menu and orders ArrayLists
     */
    public OrderKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Item>();
    }

    /**
     * METHODS:
     */

    /**
     * addMenuItem
     * creates a new Item object and adds it to the menu ArrayList
     * 
     * @param name
     * @param price
     *              the item will need to be assigned an index property, which will
     *              be the index of the item in the menu ArrayList
     */

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        item.setIndex(this.menu.size());
        this.menu.add(item);
    }

    /**
     * displayMenu
     * with the menu array display the menu without needing to separate arrays of
     * names and prices
     * will display all of the items from the menu array like this:
     * 1. Item1: $1.00
     * 2. Item2: $2.00
     */
    public void displayMenu() {
        for (int i = 0; i < this.menu.size(); i++) {
            System.out.println(i + 1 + ". " + this.menu.get(i).getName() + ": $" + this.menu.get(i).getPrice() + "/n");
        }

    }

    /**
     * newOrder
     * take input from the user in the terminal to create a new order instance and
     * add it to the orders array
     * console input will be a String.equals() method to determine if the input is a
     * valid item name
     * cast the string to an int using the Integer.parseInt() method
     */
    public void NewOrder() {
        System.out.println("Please enter the customer name for the order: ");
        String name = System.console().readLine();

        // create a new order instance
        Order order = new Order(name);
        // display the menu
        displayMenu();

        // prompt the user to enter the item number of the item they want to order
        System.out.println("Please enter the item number for the order: ");
        String itemNumber = System.console().readLine();

        // write a while loop to collect all users order items
        while (!itemNumber.equals("q")) {
            // convert the itemNumber to an int using the Integer.parseInt()method
            int itemNumberInt = Integer.parseInt(itemNumber) - 1;

            if (itemNumberInt < 0 || itemNumberInt >= this.menu.size()) {
                System.out.println("Invalid item number. Please try again.");
                itemNumber = System.console().readLine();
            } else {
                // get the item object from the menu, and add the item to the order
                Item item = this.menu.get(itemNumberInt);
                order.addItem(item);
                // ask the user to enter a new item index or "q" to quit and take the input
                System.out.println("Please enter the item number for the order or 'q' to quit: ");
                itemNumber = System.console().readLine();
            }
        }

        // display the order
        order.display();
    }

    /**
     * addMenuByInput
     * creates a method that lets an admin add menu items manually to the menu array
     */

    public void addMenuByInput() {
        // ask the user to enter the item name
        System.out.println("Please enter the item name: ");
        String name = System.console().readLine();
        // ask the user to enter the item price
        System.out.println("Please enter the item price: ");
        String price = System.console().readLine();
        // convert the price to a double using the Double.parseDouble() method
        double priceDouble = Double.parseDouble(price);
        // create a new item object and add it to the menu array
        Item item = new Item(name, priceDouble);
        this.menu.add(item);
    }
}
