package HotelAdmin.Patterns.factorypattern;

public class ConnectingRooms implements RoomPackage {
    @Override
    public void loadRoomPackage() {
        System.out.println(" Room connected with other rooms:\n " + getValuta());
    }

    @Override
    public String getValuta() {
        return "Price of room: $ " + getPriceOfRoom();
    }

    @Override
    public String getPriceOfRoom() {
        return String.valueOf(100);
    }
}
