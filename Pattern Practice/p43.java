/*  5
   54
  543
 5432
54321
*/

class p43{
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--){

			for(int sp=1;sp<i;sp++){

				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}