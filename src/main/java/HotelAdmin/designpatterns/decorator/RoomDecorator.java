package HotelAdmin.designpatterns.decorator;

public abstract class RoomDecorator extends RoomType{
    RoomType roomType;

    public abstract String getDescription();
}
