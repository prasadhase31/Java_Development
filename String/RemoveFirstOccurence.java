/* Write a Java  program to remove the first occurrence of a word from a string.*/


import java.util.*;
class RemoveFirstOccurence{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string:");
		String s1=sc.nextLine();

		System.out.println("Enter word to remove:");
		String word=sc.nextLine();

		int index=s1.indexOf(word);

		if(index!=-1){
			String result=s1.substring(0,index)+s1.substring(index+word.length());

			System.out.println("Update String:"+result);
		}
		else{
			System.out.println("Word not found");
		}
	}
}