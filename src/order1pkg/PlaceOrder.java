package order1pkg;
import java.util.Scanner;
import productpkg.Product;
import order1.Order1;

class PlaceOrder{
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
       
       //for product input
       System.out.println("Enter Product Id:");
       int id=sc.nextInt();

       sc.nextLine();
       System.out.println("Enter Prodcut Name:");
       String name=sc.nextLine();

       System.out.println("Enter Product Category:");
       String category=sc.nextLine();

       System.out.println("Enter Product Price:");
       double price=sc.nextDouble();

       System.out.println("Enter Discount (%):");
       double discount=sc.nextDouble();

       Product p1=new Product(id,name,category,price,discount);


       //for order input

       System.out.println("Enter Order Id:");
       int ordid=sc.nextInt();

       System.out.println("Enter Customer Id:");
       int custid=sc.nextInt();
       
       sc.nextLine();
       System.out.println("Enter Customer Name:");
       String custName=sc.nextLine();

       System.out.println("Enter Quantity:");
       int quantity=sc.nextInt();
       
       System.out.println("Enter Total Amount:");
       double total=sc.nextDouble();

       Order1 o1=new Order1(ordid,custid,name,quantity,total);

       double finalPrice=p1.getFinalPrice();
       double totalPayable=finalPrice*quantity;
       o1.setTotalAmount(totalPayable);


       o1.displayOrderDetails();


       p1.displayProductDetails();

      sc.close();
	}
} 