/*Write a  program to enter two numbers and perform all arithmetic operations.*/

import java.util.*;
public class p2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;

        System.out.println("Sum:"+sum);
        System.out.println("Sub:"+sub);
        System.out.println("Mul:"+mul);
        System.out.println("Div:"+div);

    }
}
