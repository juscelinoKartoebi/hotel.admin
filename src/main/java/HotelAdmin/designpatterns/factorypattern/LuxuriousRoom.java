package HotelAdmin.designpatterns.factorypattern;

public class LuxuriousRoom implements RoomPackage {
    @Override
    public void loadRoomPackage() {
        System.out.println("Welcome to your luxurious room King!!");
    }
}
