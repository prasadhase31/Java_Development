/*
    a
   ba
  cba
 dcba
edcba
*/

class p48{
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){

			for(int sp=i;sp<5;sp++){
				System.out.print(" ");
			}
			for (int j=i;j>=1;j-- ) {
				
			System.out.print((char)(96+j));
		}
		System.out.println();
		}
		
	}
}