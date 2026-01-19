public class p2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10}; // 

        int sum = 0; // Variable to store sum of elements

        // Loop through the array to calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / arr.length;

        // Print the result
        System.out.println("Average = " + average);
    }
}
