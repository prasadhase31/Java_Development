//find first and last digit

import java.util.*;

class findDigit{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a number");
		int num=sc.nextInt();

		int lastDigit=num%10;

		int firstDigit=num;
		while(firstDigit>=10){
         firstDigit=firstDigit/10;
		}

		System.out.println("First Digit:"+firstDigit);
		System.out.println("Last Digit:"+lastDigit);
		

	}
}