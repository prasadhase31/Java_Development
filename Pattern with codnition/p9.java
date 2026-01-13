/*
54321
44321
33321
22221
11111
*/ 

class p9{
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--){

			for(int j=5;j>=1;j--){

				if(j>i){

					System.out.print(i);

				}else{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}