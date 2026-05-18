class Student{
	
	private int id;
	private String name;

	Student(){

		
	}

	Student(int id,String name){
		this.id=id;
		this.name=name;
	}

	public void setId(int id){
		this.id=id;
	}

	public void setName(String name){
		this.name=name;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	class Demo{

		public static void main(String[] args) {
			
			Student s1=new Student();

			s1.setId(12);
			s1.setName("Prasad");

			System.out.println(s1.getId());
			System.out.println(s1.getName());

		}
	}



}