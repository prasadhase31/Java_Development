//using interface

interface Payment{
	void pay();
}
class UPI implements Payment{
	public void pay(){

	System.out.println("Payment via UPI");
}
}

class creditCard implements Payment{
	public void pay(){
		System.out.println("Payment via creditcard");

	}
}

class p2{
	public static void main(String[] args) {
		
     Payment p1=new UPI();
     Payment p2=new creditCard();

     p1.pay();
     p2.pay();
	}
}