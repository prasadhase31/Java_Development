import java.util.*;

class power{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a base number");
		int base=sc.nextInt();

		System.out.println("enter power:");
		int pow=sc.nextInt();

		int result=1;

		for(int i=1;i<=pow;i++){
         result=result*base;
		}
		System.out.println("result="+result);
	}
}