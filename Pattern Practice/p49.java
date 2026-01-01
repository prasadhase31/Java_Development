class p49{
	
	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--){

			for(int sp=1;sp<i;sp++){

				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}