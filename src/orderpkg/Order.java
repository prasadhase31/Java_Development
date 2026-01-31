package orderpkg;

class Order{
	
	private int ordId;
	private int custId;
	private String custName;
	private int quantity;
	private double totalAmount;

	public Order (int ordId,int custId,String custName,int quantity){
		this.ordId=ordId;
		this.custId=custId;
		this.custName=custName;
		this.quantity=quantity;
	}
	public void calculateTotal(double discountPrice){
		totalAmount=discountPrice*quantity;
	}

	public void displayOrderDetails(){
		System.out.println("Order Id :"+ordId);
		System.out.println("Customer Id :"+custId);
		System.out.println("Customer Name :"+custName);
		System.out.println("Quantity :"+quantity);
		System.out.println("Total payable :"+totalAmount);

	}
}