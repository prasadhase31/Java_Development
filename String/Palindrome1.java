/*Using Two Pointer

It saves memory
*/
class Palindrome1{
	
	public static void main(String[] args) {
		
		String str="nayan";
		int start=0;
		int end=str.length()-1;
		boolean isPalindrome=true;

		while(start<end){
			if(str.charAt(start)!=str.charAt(end)){
				isPalindrome=false;
				break;
			}
			start++;
			end--;
		}
		System.out.println(isPalindrome?"Palindrome":"Not");
	}
}