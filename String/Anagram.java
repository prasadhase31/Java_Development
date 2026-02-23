import java.util.Arrays;
class Anagram{
	
	public static void main(String args[]){

		String s1="Listen";
		String s2="Silent";

		char[]a=s1.toCharArray();
		char[]b=s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if(Arrays.equals(a,b)){
			System.out.println("Anagram");
		}
		else{
			System.out.println("Not Anagram");
		}
	}
}