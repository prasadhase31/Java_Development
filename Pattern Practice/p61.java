/*
abcde
 bcde
  cde
   de
    e
    */

class p61{
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){

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