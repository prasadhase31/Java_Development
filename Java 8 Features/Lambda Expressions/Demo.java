import java.util.function.Predicate;
class Demo{
	
	public static void main(String[] args) {
		
		Predicate<Integer> p=x -> x>10;

		//System.out.println(p.test(20));
		//System.out.println(p.test(5));
        
       // Predicate<Integer>p1=x -> x>10;
        //Predicate<Integer>p2=x -> x<50;

       // System.out.println(p1.and(p2).test(20));

        //System.out.println(p1.or(p2).test(20));

        
	}
}