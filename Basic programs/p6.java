/* Write a  program to enter length in centimetres and convert it into metre and kilometre.
 */

import java.util.*;
public class p6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length in centimeter");
        double cm=sc.nextDouble();

        double meter=cm/100;
        double kilometer=cm/100000;

        System.out.println("length in meter:"+meter);
        System.out.println("length in kilometer:"+kilometer);
    }
}
