//Given five positive integers, find the minimum and maximum values that can be calculated 
//by summing exactly four of the five integers. 
//Then print the respective minimum and maximum values as a single line of two space-separated long integers.
class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != arr.get(arr.size() - 1)) {
                min += arr.get(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != arr.get(0)) {
                max += arr.get(i);
            }
        }
        System.out.println(min + " " + max);
    }
}