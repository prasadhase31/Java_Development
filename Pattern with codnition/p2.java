/*
12345
12342
12333
12444
15555
*/

class p2{
	
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++){

		for(int j=1;j<=5;j++){

			if(j<=6-i){

				System.out.print(j);
			}
			else{

				System.out.print(i);
			}
		}
		System.out.println();
	}
}

}