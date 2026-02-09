 class BMI{
	
	private String name;
	private int age;
	private double weight;
	private double height;

	public BMI(String name,int age,double height,double weight){

		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
	}
    
    public BMI(String name,double weight,double height){
    	this(name,20,weight,height);
    }

    public String getName(){
    	return name;
    }
    
    public int getAge(){
    	return age;
    }

    public double weight(){
    	return weight;
    }
    
    public double height(){
    	return height;
    }

    public double getBMI(){
    	return (weight*703)/(height*height);
    }

    public String getStatus(){
    	double bmi=getBMI();

    	if(bmi<18.5)
    		return "Underweight";

    	else if(bmi<25)
    		return"Normal";

    	else if(bmi<30)
    		return"Overweight";

    	else
    		return"Obese";

    }
}

public class p2{

	public static void main(String[] args) {
		
		BMI b1=new BMI("Prasad",22,60,168);

		BMI b2=new BMI("Mangesh",22,66);

		System.out.println(b1.getName()+"BMI:"+b1.getBMI());
		System.out.println("Status:"+b1.getStatus());

		System.out.println();

		System.out.println(b2.getName()+"BMI:"+b2.getBMI());
		System.out.println("Status:"+b2.getStatus());
	}
}