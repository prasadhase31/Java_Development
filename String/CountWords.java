class CountWords{
	
	public static void main(String[] args) {
		
		String str="I love Java language";

		String[] words=str.trim().split("\\s+");

		System.out.println("Words:"+words.length);
	}
}