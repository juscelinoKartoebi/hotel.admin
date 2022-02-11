package HotelAdmin.designpatterns.factorypattern;

public class StandardHotelRoom implements RoomPackage {

    @Override
    public void loadRoomPackage() {
        System.out.println("Room with a queen-size bed: " + valuta());
    }
    @Override
    public String valuta() {
        return "$" + priceOfRoom();
    }
    @Override
    public String priceOfRoom() {
        return String.valueOf(55);
    }
}
