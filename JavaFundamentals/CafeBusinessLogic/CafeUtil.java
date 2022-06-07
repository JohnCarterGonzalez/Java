import java.util. ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil {
    //reward system for customers. calculats how many drinks they need after 10 weeks
    // write a method that sums together ever consecutive integer from 1 to 10 and returns the sum and allows for the admin to modulate the weeks
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }
 
    //given an array of item prices from an order, sum all of the prices in the array and return the total
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    //given an array of menu items, print each item on a separate line
    public void displayMenu(ArrayList<String> menuItems) {
        int index = 0;
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((index++) + ": " + menuItems.get(i));
        }
    }

    //print a string to the console
    // get the user input from the terminal and store it in a variable userName
    //print the userName to the console saying, "Hello, [user name here]"
    //next print "there are ___ people in front of you" using the nymber for how many people are ahead of them (how many items already in the array)
    //add the customers name to the given list and print the list 
    //no need to return anything 
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

    //implement addCustomers, make a method where an user can enter multiple customers and add them to the list
    //use a while loop and ask the user to type "q" when they are finished entering names
    public void addCustomers(ArrayList<String> customers) {
        System.out.println("Please enter a customer: ");
        String customerName = System.console().readLine();
        while (!customerName.equals("q")) {
            customers.add(customerName);
            System.out.println("Please enter your name: ");
            customerName = System.console().readLine();
        }
    }

    //void printPriceChart(String product, double price, int maxQuantity)
    // given a product, price, and maxQuantity, print a price chart for the product that shows the price for each quantity
    // formats the prices as currency 
    // takes .50 more off the original price ever time the quantity increases 
    void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println("Price Chart for " + product);
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.printf("%d: $%.2f\n", i, price);
            price -= 0.50;
        }

    }

}
