/* Write a Java  program to remove all occurrences of a word in a given string.*/

import java.util.Scanner;
 class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string:");
        String str = sc.nextLine();

        System.out.println("Enter the word to remove:");
        String word = sc.nextLine();

        String result = str.replace(word, "");

        System.out.println("Updated String:");
        System.out.println(result);

        sc.close();
    }
}
