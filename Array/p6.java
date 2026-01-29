/*From a given array, calculate the sum of all odd elements only.*/


class p6{

    static int sumOdd(int arr[]){
    	int sum=0;

    	for(int i=0;i<arr.length;i++){
    		if(arr[i]%2!=0){
             sum=sum+arr[i];

    		}
    	}
    	return sum;
    }
	
	public static void main(String[] args) {
		
		int arr[]={11,22,33,44,55};

		System.out.println("Odd elements = ");

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){

				System.out.println(arr[i]+" ");
			}
		}
		int result = sumOdd(arr);
		System.out.println("\nsum ="+result);

	}
}
