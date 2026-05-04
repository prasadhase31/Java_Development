import java.util.*;
class Demo{
	
	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();

		map.put(101,"Prasad");
		map.put(102,"Siddhu");
		map.put(103,"Sharvil");

		System.out.println(map);

		System.out.println(map.get(102));

		map.remove(103);
		System.out.println(map.containsKey(101));

		//System.out.println(map);


	}
}