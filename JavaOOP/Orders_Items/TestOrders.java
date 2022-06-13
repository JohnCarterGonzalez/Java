import java.util.*;

public class TestOrders {
    public static void main(String[] args) {
        
        // Menu Items
        Items coffee = new Items();
        coffee.name = "coffee";
        coffee.price = 2.50;

        Items mocha = new Items();
        mocha.name = "mocha";
        mocha.price = 3.50;

        Items latte = new Items();
        latte.name = "latte";
        latte.price = 4.00;

        Items cappuccino = new Items();
        cappuccino.name = "cappuccino";
        cappuccino.price = 3.00;
    
        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders();
        order1.name = "Cindhuri";

        Orders order2 = new Orders();
        order1.name = "Jimmy";

        Orders order3 = new Orders();
        order1.name = "Noah";

        Orders order4 = new Orders();
        order1.name = "Sam";

    
        // Application Simulations
        order2.items.add(coffee);
        order2.total += coffee.price;

        order3.items.add(cappuccino);
        order3.total += cappuccino.price;

        order4.items.add(latte);
        order4.total += latte.price;

        order1.ready = true;

        order4.items.add(latte);
        order4.items.add(latte);
        order4.total = latte.price * 2;

        order2.ready = true;

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
