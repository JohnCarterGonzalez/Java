// create a PlusMinus function that takes an array of integers and prints the number of positive, negative and zeros.
// Example:
// Input: [1,2,3,4,5]
// Output:
//     There are 5 positive numbers
//     There are 0 negative numbers
//     There are 0 zeros
public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("There are " + positive + " positive numbers");
        System.out.println("There are " + negative + " negative numbers");
        System.out.println("There are " + zero + " zeros");
    }
}