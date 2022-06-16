public class DoreTest {
    public static void main(String[] args) {
        OrderKiosk oK = new OrderKiosk();

        oK.addMenuItem("Item1", 1.00);
        oK.addMenuItem("Item2", 2.00);
        oK.addMenuItem("Item3", 3.00);

        // oK.addMenuByInput();
        oK.NewOrder();
    }
}
