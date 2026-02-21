/*
eeeee
dddd
ccc
bb
a
*/

class p33{
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){

			for(int j=5;j>=i;j--){

				System.out.print((char)(102-i));
			}
			System.out.println();
		}
	}
}