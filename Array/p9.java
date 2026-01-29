/*Sum of rows and columns*/

class p9{

	static void printRowsAndColumns(int arr[][]){

		int rowsSum=0;
		int colSum=0;

		for(int i=0;i<arr.length;i++){
			rowsSum=0;
			colSum=0;

			for(int j=0;j<arr[i].length;j++){
				rowsSum+=arr[i][j];
				colSum+=arr[j][i];
			}
			System.out.println("Row :"+rowsSum);
			System.out.println("Col :"+colSum);
		}
	}
	
	public static void main(String[] args) {
		int arr[][]={{1,2,3},{4,5,6,},{7,8,9}};
		printRowsAndColumns(arr);

	}
}