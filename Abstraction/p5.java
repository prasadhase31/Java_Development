interface Mobile{

	public void message();
	public void call();
	public void useApps();
}

class Realme implements Mobile{
	@Override
	public void message(){
		System.out.println("Message from Mobile");
	}
	@Override
	public void call(){
		System.out.println("Call from Mobile");
	}
	@Override
	public void useApps(){
		System.out.println("Apps used in Mobile");
	}
}

class p5{
	
	public static void main(String[] args) {
		
     Mobile m1=new Realme();

     m1.message();
     m1.call();
     m1.useApps();
	}
}