//Append Number

import java.util.*;
class Append{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1=sc.nextInt();

		System.out.println("Enter two number:");
		int num2=sc.nextInt();

		int temp=num2;

		while(temp>0){
			num1=num1*10;
			temp=temp/10;
		}
		int result=num1+num2;

		System.out.println("Appended Number:"+result);

		sc.close();
	}
}