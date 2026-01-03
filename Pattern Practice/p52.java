/*
11111
 2222
  333
   44
    5
    */

class p52{
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){

			for(int sp=1;sp<i;sp++){

				System.out.print(" ");
			}
			for(int j=i;j<=5;j++){

				System.out.print(i);
			}
			System.out.println();
		}
	}
}