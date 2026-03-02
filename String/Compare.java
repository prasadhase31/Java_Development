/*Write a Java  program to compare two strings.*/

class Compare{
	
	public static void main(String[] args) {
		
		String s1="Prasad";
		String s2=new String("Prasad");

		if(s1.equals(s2)){
			System.out.println("String is equals");
		}
		else{
			System.out.println("String is not equals");
		}
	}
}
