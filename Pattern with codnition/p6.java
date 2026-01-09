/*
55555
44445
33345
22345
12345
*/

class p6{
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--){

			for(int j=1;j<=5;j++){

				if(j<i){

					System.out.print(i);
				}
				else{

					System.out.print(j);
				}

			}
			System.out.println();
		}
	}
}