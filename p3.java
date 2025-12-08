/*Write a  program to enter the length and breadth of a rectangle and find its perimeter.
 */

import java.util.*;
public class p3 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter length");
     double length=sc.nextDouble();
     System.out.println("Enter breadth");
     double breadth=sc.nextDouble();

     double perimeter=2*(length+breadth);

     System.out.println("Perimeter of rectangle:"+perimeter);

    }
}
