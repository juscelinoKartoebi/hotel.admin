package HotelAdmin.designpatterns.decorator;

public class HalloweenSpecial extends RoomType{

    public HalloweenSpecial(){
        description = "room with a Halloween vibe";
    }
    public double cost() {
        return 50;
    }
}
