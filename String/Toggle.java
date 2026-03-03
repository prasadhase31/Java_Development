/*Write a Java  program to toggle the case of each character of a string. */

import java.util.*;
class Toggle{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string:");
		String s1=sc.nextLine();

		String result="";

		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);

			if(Character.isUpperCase(ch)){
				result+=Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch)){
				result+=Character.toUpperCase(ch);
			}
			else{
				result+=ch;
			}

			}
			System.out.println("Toggled String:"+result);
		}

	}

