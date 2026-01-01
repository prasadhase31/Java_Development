/* Write a  program to enter two angles of a triangle and find the third angle.
 */

import java.util.*;
public class p7 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter two angles");
     int a=sc.nextInt();
     int b=sc.nextInt();

     int c=180-(a+b);

     System.out.println("Third angle of triangle is:"+c);
    }
}
