import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<Item>();
    private boolean ready;
    private String name;

    public Order() {
        this.ready = false;
        this.name = "guest";
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item items) {
        this.items.add(items);
    }

    // getStatusMessage
    // creates a method called getStatusMessage that returns a string
    // if the order is ready it returns "Your order is ready!"
    // if the order is not ready it returns "Thank you for waiting. Your order will
    // be ready soon."
    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready!";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // getOrderTotal, creates a method that sums together each of the item's prices
    // and returns the total amount
    public double getOrderTotal() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    // method called "display" that prints out the order information
    public void display() {
        System.out.println("Order for " + name);
        for (Item item : items) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

}
