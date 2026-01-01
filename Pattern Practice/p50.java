/*
    e
   de
  cde
 bcde
abcde
*/

class p50{
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--){
			for(int sp=1;sp<i;sp++){

				System.out.print(" ");
			}
			for(int j=i;j<=5;j++){

				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}
}