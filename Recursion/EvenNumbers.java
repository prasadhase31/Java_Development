class EvenNumbers{
	
	public static void printEven(int start,int end){

		if(start>end)
			return;

		if(start%2==0)
			System.out.println(start+" ");
	}
}