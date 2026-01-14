import java.util.*;
class LCM{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number");
		int a=sc.nextInt();

		System.out.println("Enter second number");
		int b=sc.nextInt();

		int x=a,y=b;

		while(y!=0){

			int temp=y;
			y=x%y;
			x=temp;
		}
		int hcf=x;
		int lcm=(a*b)/hcf;

		System.out.println("lcm="+lcm);
	}
	
}