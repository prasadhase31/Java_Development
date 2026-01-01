 /*Write a  program to enter the length and breadth of a rectangle and find its area.
 */

 import java.util.*;
 public class p4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length");
        double length=sc.nextDouble();
        System.out.println("Enter breadth");
        double breadth=sc.nextDouble();

        double area=length*breadth;

        System.out.println("Enter area of rectangle:"+area);
    }
}
