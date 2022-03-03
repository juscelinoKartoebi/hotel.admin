package HotelAdmin.Patterns.factorypattern;

public class StandardHotelRoom implements RoomPackage {

    @Override
    public void loadRoomPackage() {
        System.out.println(" Room with a two persons bed:\n " + getValuta());
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
