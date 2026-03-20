class EvenNumbers{
	
	public static void printEven(int start,int end){

		if(start>end)
			return;

		if(start%2==0)
			System.out.println(start+" ");

		printEven(start+1,end);
	}
	public static void main(String[] args) {
		printEven(1,10);
	}
}