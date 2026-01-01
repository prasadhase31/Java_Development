/*Write a  program to calculate the area of an equilateral triangle.
 */

import java.util.*;
public class p9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter side of equilateral triangle");
        double side=sc.nextDouble();

        double area=(Math.sqrt(3)/4)*side*side;

        System.out.println("Area of equilateral triangle is:"+area);
    }
}
