package reservationpkg;

import roompkg.Room
class BookRoom{
	
     public static void main(String[] args) {
     	
     	Scanner sc=new Scanner(System.in);

     	System.out.println("Enter room number :");
     	int roomNo=sc.nextInt();

     	System.out.println("Enter room type :");
     	String type=sc.nextLine();

     	System.out.println("Enter rate per night :");
     	double rate=sc.nextDouble();

     	System.out.println("Enter discount :");
     	double discount=sc.nextDouble

     	Room r1=new Room(roomNO,type,rate,discount);

     	System.out.println("------------------------------------");


     	System.out.println("Enter Reservation ID :");
     	int resId=sc.nextInt();

     	System.out.println("Enter Customer ID :");
     	int custId=sc.nextInt();

     	System.out.println("Enter Customer name :");
     	String name=sc.nextLine();

     	System.out.println("Enter Number Of Nights :");
     	int nights=sc.nextInt();

     	Reservation r2=new Reservation(resId,custId,name,nights);


     	double total=room.calculateRoomCost(nights);
     	reservation.setTotalAmount(total);

     	r1.displayRoomDetails();
     	r2.displayReservationDetails();
     }
}