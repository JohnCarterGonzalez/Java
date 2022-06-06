public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double lattePrice = 2.5;
        double cappuccinoPrice = 2.0;
        double dripPrice = 1.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        //customer interactions 
        //print messages to the console
        //print the total of the order
        //print the order status
        if (isReadyOrder1) {
            System.out.println(generalGreeting + customer1 + readyMessage + displayTotalMessage + (dripPrice) + ".");
        } else {
            System.out.println(generalGreeting + customer1 + pendingMessage);
        }
        if (isReadyOrder2) {
            System.out.println(generalGreeting + customer2 + readyMessage + displayTotalMessage + (cappuccinoPrice) + ".");
        } else {
            System.out.println(generalGreeting + customer2 + pendingMessage);
        }
        if (isReadyOrder3) {
            System.out.println(generalGreeting + customer3 + readyMessage + displayTotalMessage + (lattePrice * 2) + ".");
        } else {
            System.out.println(generalGreeting + customer3 + pendingMessage);
        }
        if (isReadyOrder4) {
            System.out.println(generalGreeting + customer4 + readyMessage + displayTotalMessage + (lattePrice - dripPrice));
        } else {
            System.out.println(generalGreeting + customer4 + pendingMessage);
        }
    }
}


