public class HotelBooking {
    String guestName;
    String roomType;
    int night;

    //Default parameter 
    HotelBooking(){
        this.guestName = "Guest";
        this.roomType = "Suite";
        this.night = 1;
    }

    //Parameterized constructor 
    HotelBooking(String guestName, String roomType, int night){
        this.guestName = guestName;
        this.roomType = roomType;
        this.night = night;
    } 

    //Copy constructor
    HotelBooking(HotelBooking previouHotelBooking){
        this.guestName = previouHotelBooking.guestName;
        this.roomType = previouHotelBooking.roomType;
        this.night = previouHotelBooking.night;
    }

    //Display details
    public void display(){
        System.out.println("Guest Name: " + guestName + "\t" + "Room type:" + roomType + "\t" + "Night: " + night);
    }

    //Main method
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Sahil","Suite",7);

        booking1.display();
        booking2.display();
    }
}
