/*
    A
   BB
  CCC
 DDDD
EEEEE
*/

class p45{
	
	public static void main(String[] args) {
		
		for (int i=1;i<=5;i++ ) {

			for(int sp=i;sp<5;sp++){

				System.out.print(" ");
			}
			for (int j=i;j>=1;j--) {
				
			System.out.print((char)(64+i));
			}

			System.out.println();
		}
	}
}