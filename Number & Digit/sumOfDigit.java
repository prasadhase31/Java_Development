//Sum of first and last digit

import java.util.*;

class sumOfDigit{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int num=sc.nextInt();

		int lastDigit=num%10;

		int firstDigit=num;
		while(firstDigit>=10){

			firstDigit=firstDigit/10;
		}

		int sum=lastDigit + firstDigit;
         
         System.out.println("Sum of digits:"+sum);
	}
}