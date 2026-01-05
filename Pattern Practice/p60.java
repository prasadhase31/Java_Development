/*
ABCDE
 ABCD
  ABC
   AB
    A
    */

class p60{
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--){

			for(int sp=5;sp>i;sp--){
               
               System.out.print(" ");

			}
			for(int j=1;j<=i;j++){

				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}