class CountCharacters{
	
	public static void main(String args[]){

		String str="Hello Java";

		int count=str.replace(" ","").length();
		System.out.println("Character:"+count);
	}
}