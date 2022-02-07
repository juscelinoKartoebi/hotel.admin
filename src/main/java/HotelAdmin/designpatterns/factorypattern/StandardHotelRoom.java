package HotelAdmin.designpatterns.factorypattern;

public class StandardHotelRoom implements RoomPackage {

    @Override
    public void loadRoomPackage() {
        System.out.println("Welcome to your room");
    }
}
