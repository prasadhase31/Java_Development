class p4{
	
	 public static void main(String[] args) {

        int[] arr = {5, 10, 15, 20, 25};

        int oddSum = 0, evenSum = 0;
        int oddCount = 0, evenCount = 0;

        System.out.print("Odd elements = ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                oddSum += arr[i];
                oddCount++;
            } else {
                evenSum += arr[i];
                evenCount++;
            }
        }

        double oddAverage = (double) oddSum / oddCount;
        double evenAverage = (double) evenSum / evenCount;

        System.out.println("→ Average = " + oddAverage);
        System.out.print("Even elements = ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("→ Average = " + evenAverage);
    }
}








