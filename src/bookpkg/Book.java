package bookpkg;

public class Book{
	
	private  int id;
	private String title;
	private String author;
	private double price;

	 public static final double discountPrice=0.10;

	 public Book(int id,String title,String auhtor,double price){

	 	this.id=id;
	 	this.title=title;
	 	this.author=author;
	 	this.price=price;
	 }
	 public String getAuthor(){
         return author;

	 }
	 public double getDiscountPrice(){
	 	return price-(price * discountPrice);
	 }

	 public void displayBookDetails(){
	 	System.out.println("Book Id :"+id);
	 	System.out.println("Book Title :"+title);
	 	System.out.println("Book Author :"+author);
	 	System.out.println("Book Price :"+price);

	 }
}