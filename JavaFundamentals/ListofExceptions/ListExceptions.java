import java.util.ArrayList;
import java.util.List;

public class ListExceptions {

    /*
     * TODO:
     * Create an ArrayList of type String
     * try to cast each element to an Integer
     * use try/catch to handle exceptions
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //add ints and strings to the list
        list.add("1");
        list.add("hello");
        list.add("3");
        list.add("world");

        for (String s : list) {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }
        }
        
    }
}
