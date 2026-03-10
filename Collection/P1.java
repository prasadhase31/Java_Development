import java.util.ArrayList;
import java.util.Iterator;
class P1{
	
	public static void main(String[] args) {
     
     ArrayList<String>family=new ArrayList<String>();
     family.add("Prasad");
     System.out.println(family.add("Prasad"));
     family.add("Siddhu");
     family.add("Swati");

     System.out.println(family.contains("Prasad"));
     System.out.println(family);
     family.remove("Prasad");
     System.out.println(family);
     System.out.println("E remove(index)"+family.remove(0));


     ArrayList<String>family1=new ArrayList<String>();
     family1.add("Shubham");
     family1.add("Sharvil");
     family1.add("Sonali");

     family.addAll(family);
     System.out.println("contains All"+family.containsAll(family1));

     family.removeAll(family1);
     System.out.println(family);

	}
}