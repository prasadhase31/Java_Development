/*
    e
   dd
  ccc
 bbbb
aaaaa
*/

class p46{
	
	public static void main(String[] args) {
		
		for (int i=5;i>=1;i-- ) {
		
			for(int sp=1;sp<i;sp++){

				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){

				System.out.print((char)(96+i));
			}
			System.out.println();
		}
	}
}