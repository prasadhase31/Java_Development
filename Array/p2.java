// Average of Array Elements

public class p2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10}; // 

        int sum = 0; 

        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Average = " + average);
    }
}
