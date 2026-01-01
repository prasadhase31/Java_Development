
import java.util.*;
class calc{
	public static void main(String[] args) {
		 
		 int a,b,result;
		 char symbol;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number 1");
       a=sc.nextInt();
        
        System.out.println("enter number 2");
       b=sc.nextInt();

		 switch(sc){

		   case 1:System.out.println("a+b");
		 	break;

		 	case 2:System.out.println("a-b");
		 	break;
            
           case 3:System.out.println("a*b");
           break;  
           
            case 4:System.out.println("a/b");
           break;  
           
           default :System.out.println("Invalid");
		 }
	}
}