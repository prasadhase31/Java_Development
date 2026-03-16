 class Product{

    static int multiply(int a, int b) {

        if(b == 0)        // base condition
            return 0;
        else
        return a + multiply(a, b-1);   // recursive call
    }

    public static void main(String[] args) {

        int a = 24;
        int b = 8;

        int result = multiply(a, b);

        System.out.println("Product is: " + result);
    }
}
	
