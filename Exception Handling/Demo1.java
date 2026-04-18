class Demo1{
	
	static void readFile() throws IOException{
		throw new IOException("File not found");
	}

	public static void main(String[] args) {
		
		try{
			readFile();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}