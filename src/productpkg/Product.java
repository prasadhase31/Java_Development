package productpkg;

public class Product{
	
	private int prodId;
	private String name;
	private String category;
	private double price;
	private double discount;

	public Product(int prodId,String name,String category,double price,double discount){

		this.prodId=prodId;
		this.name=name;
		this.category=category;
		this.price=price;
		this.discount=discount;
	}
	public double getFinalPrice(){
		return price-(price*discount/100);
	}
	public void displayProductDetails(){
		System.out.println("Product Id :"+prodId);
		System.out.println("Product Name :"+name);
		System.out.println("Category :"+category);
		System.out.println("Price :"+price);
		System.out.println("Discount :"+discount+"%");
	}
}