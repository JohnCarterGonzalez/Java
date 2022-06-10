import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputExample {
    public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter String: ");
      String s = br.readLine();
      System.out.print("Enter Integer: ");
      try {
        int i = Integer.parseInt(br.readLine());
      } catch(NumberFormatException nfe){
        System.err.print("Invalid Format");
      }
    }
}
