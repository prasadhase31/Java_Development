//Multilevel Constructor

 class Art{
	public Art(){
    System.out.println("Art Constructor");

	}
}
 class Drawing extends Art{
	public Drawing(){
		System.out.println("Drawing Constructor");
	}
}
 class Cartoon extends Drawing{
	public Cartoon(){
		System.out.println("Cartoon Constructor");
	}
}

class p1{
	
	public static void main(String[] args) {
		Cartoon c1=new Cartoon();
		
	}
}