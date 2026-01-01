/*Write a  program to enter the radius of a circle and find its diameter, circumference and area.
 */

import java.util.*;
public class p5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter radius of circle");
        double r=sc.nextDouble();

        double diameter=2*r;
        double circumfernce=2*Math.PI*r;
        double area=Math.PI*r*r;

        System.out.println("Diameter:"+diameter +",Circumference:"+circumfernce +",Area:"+area);
    }
}
