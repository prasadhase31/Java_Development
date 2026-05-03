class Main{
	
	private String name;
	private int age;
	private int rollno;

	Main(String name,int age,int rollno){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}

public class Student{
	public static void main(String[] args) {
		
		Main m1=new Main();
		m1.setName("Prasad");
		m1.setAge(23);

		System.out.println(m1.getName());
		System.out.println(m1.getAge());
	}
}

