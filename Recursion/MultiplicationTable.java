public class MultiplicationTable {

    static void printTable(int n, int i) {

        if(i > 5)     // base condition
            return;

        System.out.println(n + " x " + i + " = " + (n*i));

        printTable(n, i+1);   // recursive call
    }

    public static void main(String[] args) {

        int n = 5;

        printTable(n, 1);
    }
} 