/*
Write a Java program to calculate the sum of digits of a number using recursion.
*/

class SumDigits{
	
	public static int sumDigits(int n){

		if (n==0)
			return 0;

		return (n%10)+sumDigits(n/10);
	}
	public static void main(String[] args) {
		int num=1234;
		System.out.println("Sum of digits:"+sumDigits(num));
	}
}