class Demo2{
	
	//finalize method
	protected void finalize(){
		System.out.println("Finalize method call");
	}

	//final method
	final void show(){
		System.out.println("This is a final method");
	}

	public static void main(String[] args) {
		
		//final variable
		final int x=10;
		System.out.println("Final variable x="+x);

		//finally block
		try{
			int a=10/0;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException"+e.getMessage());
		}
	}
}