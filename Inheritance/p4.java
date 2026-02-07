class Person{
	private String name;
    private String address;

    public Person(String name,String address){
    	this.address=address;
    	this.name=name;
    }

    public String getName(){
    	return name;
    }

    public String getAddress(){
    	return address;
    }

    public void setAddress(String address){
    	this.address=address;
    }

    public String toString(){
    	return "Person[name="+ name +",address="+ address +"]";
    }
}
class Student extends Person{

	private String program;
	private int year;
	private double fee;

	public Student(String program,int year,double fee,String name,String address){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
}
	public String getProgram(){
		return program;
	}

	 public void setProgram(String program){
	 	this.program=program;
	 }

	 public int getYear(){
	 	return year;
	 }

	 public void setYear(int year){
	 	this.year=year;
	 }

	 public double getFee(){
	 	return fee;
	 }

	 public void setFee(double fee){
	 	this.fee=fee;
	 }

	 public String toString(){
	 	return "Student["+super.toString()+",program="+ program +",fee="+ fee +",year="+ year +"]";
	 }

	}

	class Staff extends Person{

		private String school;
		private double pay;

		public Staff(String school,double pay,String name,String address){
			super(name,address);
			this.school=school;
			this.pay=pay;
		}
		public String getSchool(){
			return school;
		}

		public void setSchool(String school){
			this.school=school;
		}

        public double getPay(){
        	return pay;
        }

        public void setPay(double pay){
        	this.pay=pay;
        }

        public String toString(){
        	return "Staff["+super.toString()+",school="+school+",pay="+pay+"]";
        }
	}


class p4{
	
	public static void main(String[] args) {
		
		Student stud=new Student("Computer Science",2024,50000,"Prasad","Pune");

		Staff s1=new Staff("ABC College",40000,"Aryan","Mumbai");

		System.out.println(stud);

		System.out.println(s1);
         



	}
}