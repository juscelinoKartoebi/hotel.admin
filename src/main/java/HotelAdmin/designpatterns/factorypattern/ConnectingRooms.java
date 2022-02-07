package HotelAdmin.designpatterns.factorypattern;

public class ConnectingRooms implements RoomPackage {
    @Override
    public void loadRoomPackage() {
        System.out.println("Welcome to your hotel room");
        System.out.println("This room is connected with another room downstairs");
        System.out.println("More room for activities!!");
    }
}
