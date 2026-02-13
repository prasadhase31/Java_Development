//Fibonacci series

import java.util.*;
class Fibonacci{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number of terms:");
		int num=sc.nextInt();

		int a=0;
		int b=1;

        System.out.println("Fibonacci Series:");

        for(int i=1;i<=num;i++){
        	System.out.println(a+" ");

        	int next=a+b;
        	a=b;
        	b=next;
        }
        sc.close();
	}
}

