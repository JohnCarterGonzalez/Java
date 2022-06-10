//Given five positive integers, find the minimum and maximum values that can be calculated 
//by summing exactly four of the five integers. 
//Then print the respective minimum and maximum values as a single line of two space-separated long integers.
class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    //Given five positive integers, find the minimum and maximum values that can be calculated 
    //by summing exactly four of the five integers. 
    //Then print the respective minimum and maximum values as a single line of two space-separated long integers.
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min = 0;
        long max = 0;
        long sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        min = sum - arr.get(0);
        max = sum - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            long temp = sum - arr.get(i);
            if (temp < min) {
                min = temp;
            }
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(min + " " + max);
    }


}