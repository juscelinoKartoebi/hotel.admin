package HotelAdmin.Patterns.Decorator;

abstract class RoomDecorator implements Room {
    protected Room tempRoom;

    public RoomDecorator(Room newRoom) {
        tempRoom = newRoom;
    }
    public String getDescription() {
        return tempRoom.getDescription();
    }
    public double getCost() {
        return tempRoom.getCost();
    }
}
