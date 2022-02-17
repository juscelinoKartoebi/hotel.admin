package HotelAdmin.designpatternsOldFile.decorator;

public class ValentineSpecial extends RoomType {

    public ValentineSpecial(){
        description = "Room with a valentine vibe";
    }

    public double cost() {
        return 50;
    }
}
