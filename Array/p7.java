import java.util.*;
class p7{
	
	static double oddAverage(int arr[]){
		int sum=0;
		int count=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i] % 2 !=0){

				sum+=arr[i];
				count++;
			}
		}
          return (double)sum/count;
     
	}

	static double evenAverage(int arr[]){
		int sum=0;
		int count=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				sum+=arr[i];
				count++;
			}
		}
		return (double)sum/count;
	}

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter array size:");
	int n=sc.nextInt();

	int arr[]=new int[n];

	System.out.println("Enter array elements:");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}

	System.out.println("Odd elements=");
     for(int i=0;i<n;i++){
     	if(arr[i]%2!=0)
     		System.out.println(arr[i]+" ");
     }
     System.out.println("Average ="+oddAverage(arr));

     System.out.println("Even elements =");
     for(int i=0;i<n;i++){
     	if(arr[i]%2==0)
     		System.out.println(arr[i]+" ");
     }
        System.out.println("Average ="+evenAverage(arr));
}
}

