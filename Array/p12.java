//Write a Java program to put even and odd elements of an array in two separate arrays.

import java.util.*;
class p12{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of Array:");
		int n=sc.nextInt();

		int arr[]=new int[n];

		System.out.println("Enter elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int evenCount=0;
		int oddCount=0;

		for(int i=0;i<n;i++){
			if(arr[i]%2==0)
				evenCount++;
		else
			oddCount++;
		}
		int even[]=new int[evenCount];
		int odd[]=new int[oddCount];

		int e=0;
		int o=0;

		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				even[e]=arr[i];
				e++;
			}
			else{
				odd[o]=arr[i];
			}

		}
		System.out.println("Even Elements:");
		for(int i=0;i<even.length;i++){
			System.out.println(even[i]+" ");
		}
		System.out.println("Odd Elements:");
		for(int i=0;i<odd.length;i++){
			System.out.println(odd[i]+" ");
		}
		sc.close();
	}
}