package HotelAdmin.designpatterns.factorypattern;

public class ConnectingRooms implements RoomPackage {
    @Override
    public void loadRoomPackage() {
        System.out.println("Room connected with other rooms");
    }

    @Override
    public String valuta() {
        return null;
    }

    @Override
    public String priceOfRoom() {
        return "$100";
    }
}
