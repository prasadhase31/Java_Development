import java.util.*;
class hcf{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first number");
		int a=sc.nextInt();

		System.out.println("Enter second number");
		int b=sc.nextInt();

		int hcf;

		while(b!=0){
          int temp=b;
          b=a%b;
          a=temp;

		}
		hcf=a;
		System.out.println("hcf="+hcf);

		}
}