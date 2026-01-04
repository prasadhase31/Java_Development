/*
AAAAA
 BBBB
  CCC
   DD
    E
    */

class p58{
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){

			for(int sp=1;sp<i;sp++){

				System.out.print(" ");
			}
			for(int j=i;j<=5;j++){

				System.out.print((char)(64+i));
			}
			System.out.println();
		}
	}
}