//Sum of Odd Elements

class p3{
	
	public static void main(String[] args) {
		
		int arr[]={11,22,33,44,55};
		int sum=0;

		System.out.println("odd elements=");

		for(int i=0;i<arr.length;i++){
          if(arr[i]%2!=0){
          	System.out.println(arr[i]+" ");
          	sum=sum+arr[i];
          }
          }
          System.out.println();
          System.out.println("sum ="+sum);


		}
	}
