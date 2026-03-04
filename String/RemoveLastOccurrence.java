class RemoveLastOccurrence{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string");
		String s1=sc.nextLine();

		System.out.println("Enter word to remove");
        
        int index=s1.lastIndexOf(word);

        if(index !=-1){
        	 String result = str.substring(0, index) 
                          + str.substring(index + word.length());
            System.out.println("Updated String:");
            System.out.println(result);
        } else {
            System.out.println("Word not found in the string.");
        }
        }
	}