/* Write a Java  program to count the total number of vowels and consonants in a string.*/


import java.util.*;
class CountVowelsAndConsonants{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter a string:");
		String s1=sc.nextLine();

		int vowels=0;
		int consonants=0;

		s1=s1.toLowerCase();

		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);

			if(ch>='a' && ch<='z'){
				if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
					vowels++;
				}
				else{
					consonants++;
				}
			}
		}
		System.out.println("Total vowels:"+vowels);
		System.out.println("Total consonants:"+consonants);
	}
}