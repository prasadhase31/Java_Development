import java.util.*;

class sumOfDigit1{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int num=sc.nextInt();

		int sum=0;
		int temp=num;

		while(temp !=0){
			int lastDigit=temp%10;
             sum+=lastDigit;
             temp=temp/10;
		}
		System.out.println("sum of digit of"+num+"="+sum);
	}
}