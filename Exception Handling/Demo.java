class Demo{
	
	public static void main(String[] args) {
		try{
			int age=15;

       if(age<18){
           throw new ArithmeticException("Not eligible for vote");

       }

       System.out.println("You can vote");
	}
	catch(ArithmeticException e){
		System.out.println(e.getMessage());
	}
	}
}