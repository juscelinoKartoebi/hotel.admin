package HotelAdmin.designpatterns.decorator;

public class ChristmasSpecial extends  RoomType{

    public ChristmasSpecial(){
    description ="room with a christmas vibe" ;
}
    public double cost() {
        return 50;
    }
}
