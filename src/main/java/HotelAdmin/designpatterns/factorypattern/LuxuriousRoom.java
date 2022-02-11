package HotelAdmin.designpatterns.factorypattern;

public class LuxuriousRoom implements RoomPackage {
    @Override
    public void loadRoomPackage() {
        System.out.println("Room with river side view and a inside pool with 3 kingsize beds: " + valuta());
    }

    @Override
    public String valuta() {
        return "$" + priceOfRoom();
    }

    @Override
    public String priceOfRoom() {
        return String.valueOf(100);
    }
}
