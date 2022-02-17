package HotelAdmin.designpatternsOldFile.decorator;

public class Candy extends RoomDecorator {

    public Candy(RoomType roomType){
        this.roomType = roomType;
    }
    public String getDescription() {
        return roomType.getDescription() + " + bowl of candy";
    }
    public double cost() {
        return roomType.cost() + 10;
    }
}
