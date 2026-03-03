/*Write a Java  program to find the first occurrence of a character in a given string.*/


import java.util.Scanner;
class FirstOccurrence{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string:");
		String s1=sc.nextLine(); 

		System.out.println("Enter character to find:");
		char ch=sc.next().charAt(0);

		int index=s1.indexOf(ch);

		if(index!=1){
			System.out.println("First occurrence of '"+ch+"'is at index:"+index);
		}
		else{
			System.out.println("Character not found:");
		}
	}
}