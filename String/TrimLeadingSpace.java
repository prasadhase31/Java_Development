/*Write a Java program to trim leading white space characters from a given string.*/

import java.util.Scanner;

public class TrimLeadingSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String result = str.stripLeading();   // Removes only leading spaces

        System.out.println("After removing leading spaces:");
        System.out.println(result);

        sc.close();
    }
}