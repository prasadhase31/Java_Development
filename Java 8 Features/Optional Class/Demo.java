class Demo{
	
	String name;
	int id;

	Demo(String name,int id){
		this.name=name;
		this.id=id;
	}

}

public class Test{

	static Optional<Demo>getDemo(){
		return Optional.ofNullable(null);
	}
	
}