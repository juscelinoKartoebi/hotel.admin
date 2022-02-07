package HotelAdmin.designpatterns.decorator;

public abstract class RoomType {
    String description = "Room";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
