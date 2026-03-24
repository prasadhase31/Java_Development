/*Write a Java program to print all even or odd numbers in a given range using recursion.*/

class EvenOddNumbers {

    // Function to print even numbers
    public static void printEven(int start, int end) {
        if (start > end)
            return;

        if (start % 2 == 0)
            System.out.print(start + " ");

        printEven(start + 1, end);
    }

    // Function to print odd numbers
    public static void printOdd(int start, int end) {
        if (start > end)
            return;

        if (start % 2 != 0)
            System.out.print(start + " ");

        printOdd(start + 1, end);
    }

    public static void main(String[] args) {
        int start = 1, end = 20;

        System.out.print("Even numbers: ");
        printEven(start, end);

        System.out.println();

        System.out.print("Odd numbers: ");
        printOdd(start, end);
    }
}