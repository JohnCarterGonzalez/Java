import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    public static void main(String[] args) {
        
    /* 
      You will need add 1 line to this file to create an instance 
      of the CafeUtil class. 
      Hint: it will need to correspond with the variable name used below..
    */
    	CafeUtil appTest = new CafeUtil();
        /* ============ App Test Cases ============= */
    
        // System.out.println("\n----- Streak Goal Test -----");
        // System.out.printf("Purchases needed by your cumulative weeks: %s \n\n", appTest.getStreakGoal(10));
    
        // System.out.println("----- Order Total Test-----");
        // double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        // System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));
        
        // System.out.println("----- Display Menu Test-----");
        
        // ArrayList<String> menu = new ArrayList<String>();
        // menu.add("drip coffee");
        // menu.add("cappuccino");
        // menu.add("latte");
        // menu.add("mocha");
        // appTest.displayMenu(menu);
    
        // System.out.println("\n----- Add Customer Test-----");
        // ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        // for (int i = 0; i < 4; i++) {
             // appTest.addCustomer(customers);
             // System.out.println("\n");
         // }
    /* 
        System.out.println("\n----- Add Customers Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        //while loop
        while (true) {
            appTest.addCustomers(customers);
            System.out.println("\n");
            System.out.println("Are you sure you want to quit? (Enter a name or 'q' for quit)");
            String userInput = System.console().readLine();
            if (userInput.equals("q")) {
                //print out the total added customers in the console and their names
                System.out.println("\n");
                System.out.println("Total customers added: " + customers.size());
                System.out.println("You have added: " + customers);
                break;
            }
        }
        */
        System.out.println("/n----- Price Chart Test-----");
        appTest.printPriceChart("Coffee", 3.5, 4);

    }
}
