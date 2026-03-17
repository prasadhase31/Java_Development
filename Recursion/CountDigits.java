//Write a Java program to count the number of digits in a number using recursion.

class CountDigits{
	
	public static int count(int n){

	if(n==0)
		return 1;

	return 1+count(n/10);
	}
	public static void main(String[] args) {
		
		int num=12345;

		int result=count(num);

		System.out.println("Number of digits:"+result);
	}
}