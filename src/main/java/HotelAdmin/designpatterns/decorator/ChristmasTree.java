package HotelAdmin.designpatterns.decorator;

public class ChristmasTree extends  RoomDecorator{

    public ChristmasTree(RoomType roomType){
        this.roomType = roomType;
    }
    public String getDescription() {
        return roomType.getDescription() + ", christmas tree";
    }

    public double cost() {
        return roomType.cost() + 20;
    }
}
