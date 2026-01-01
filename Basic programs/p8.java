/*  Write a  program to enter the base and height of a triangle and find its area.
 */

import java.util.*;
public class p8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter base of triangle");
        double b=sc.nextDouble();
        System.out.println("Enter height of triangle");
        double h=sc.nextDouble();

        double area=0.5*b*h;

        System.out.println("Area of triangle is:"+area);
    }
}
