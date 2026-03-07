class Error{
	
	public static void recursiveCall() {
	
	}
	public static void main(String args[]){
		try{
			recursiveCall();
		}
		catch(StackOverflowError e){
			System.out.println("StackOverflowError:"+e.getMessage());
		}

		try{
			int arr[]=new int[Integer.MAX_VALUE];
		}
		catch(OutOfMemoryError e){
			System.out.println("OutOfMemoryError:"+e.getMessage());
		}
	}
}