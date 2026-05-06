import java.util.*;

class Student{

	int id;
	String name;

	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class IdComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.id - s2.id;
	}
}

public class Demo{
	
}