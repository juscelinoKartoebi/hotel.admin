package HotelAdmin.designpatternsOldFile.decorator;

public class Wine extends RoomDecorator{

    public Wine (RoomType roomType){
        this.roomType = roomType;
    }
    public String getDescription() {
        return roomType.getDescription() + " + wine";
    }
    public double cost() {
        return roomType.cost() + 15;
    }
}
