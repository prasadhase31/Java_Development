package roompkg;

public class Room{
	
	private int roomNo;
	private String roomType;
	private double ratePerNight;
	private double discount;

	public Room(int roomNo,String roomType,double ratePerNight,double discount){
		this.roomNo=roomNo;
		this.roomType=roomType;
		this.ratePerNight=ratePerNight;
		this.discount=discount;
	}

	public void getRoomType(){
		return roomType;
	}

	public void getRatePerNight(){
		return ratePerNight;
	}

	public double calculateRoomCost(int nights){
		return (ratePerNight * nights)-discount;
	}
	public void displayRoomDetails(){

		System.out.println("Room No :"+roomNo);
		System.out.println("Room Type :"+roomType);
		System.out.println("Room Rate Per Night :"+ratePerNight);
	}   System.out.println("Discount :"+discount);
	}
	

	

	
