package order1pkg;

public class Order1{
	private int orderId;
	private int custId;
	private String custName;
	private int quantity;
	private double totalAmount;

	public Order1(int orderId,int custId,String custName,int quantity,double totalAmount){
		this.orderId=orderId;
		this.custId=custId;
		this.custName=custName;
		this.quantity=quantity;
		this.totalAmount=totalAmount;
	}
	 public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
	    }
	
	public void displayOrderDetails(){
		System.out.println("Order Id :"+orderId);
		System.out.println("Customer Id :"+custId);
		System.out.println("Customer Name:"+custName);
		System.out.println("Quantity:"+quantity);
		System.out.println("Total Amount :"+totalAmount);

	}

}