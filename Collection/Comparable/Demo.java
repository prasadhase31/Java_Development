import java.util.*;
class Students implements Comparable<Students>{
	int id;
	String name;

	Students(int id,String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Students s){

		return this.id - s.id;//ascending order
		//return s.id-this.id;   descending order
	}
	
}
public class Demo{

	public static void main(String[] args) {
		
		ArrayList<Students> list=new ArrayList<>();

		list.add(new Students(3,"A"));
		list.add(new Students(2,"B"));
		list.add(new Students(1,"C"));

		Collections.sort(list);

		for(Students s:list){
			System.out.println(s.id+" "+s.name);
		}

	}
}