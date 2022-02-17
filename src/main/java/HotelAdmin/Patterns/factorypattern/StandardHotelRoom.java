package HotelAdmin.Patterns.factorypattern;

public class StandardHotelRoom implements RoomPackage {

    @Override
    public void loadRoomPackage() {
        System.out.println(" Room with a queen-size bed:\n " + getValuta());
    }
    @Override
    public String getValuta() {
        return "Price of Room: $" + getPriceOfRoom();
    }
    @Override
    public String getPriceOfRoom() {
        return String.valueOf(55);
    }
}
