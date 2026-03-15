class Example{
	public static int sum(int n){

	if(n==0)
	return 0;
	else
	return n+sum(n-1);
	}
}
public class Sum{
	
	public static void main(String[] args) {
		int num=5;
		int result=Example.sum(num);
		System.out.println("Sum of first"+ num +"natural numbers is:"+result);
	}
}