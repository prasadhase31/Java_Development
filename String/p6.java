class p6{
	
	public static void main(String[] args) {
		
		String s1="Prasad";
		String s2=new String("Prasad");
		String s3=s1+"Hase";

		if(s1.equals(s3)){
			System.out.println("Equals");
		}
		else{
			System.out.println("Not Equals");
		}
		if(s2==s3){
			System.out.println("Equals");
		}
		else{
			System.out.println("Not Equals");
		}
	}
}