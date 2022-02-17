package HotelAdmin.Patterns.factorypattern;

public class LuxuriousRoom implements RoomPackage {
    @Override
    public void loadRoomPackage() {
        System.out.println(" Room with river side view, inside pool and 3 king-size beds:\n " + getValuta());
    }
    @Override
    public String getValuta() {
        return "Price of room: $" + getPriceOfRoom();
    }

    @Override
    public String getPriceOfRoom() {
        return String.valueOf(500);
    }
}
