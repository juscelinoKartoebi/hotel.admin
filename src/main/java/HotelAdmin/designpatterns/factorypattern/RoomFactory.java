package HotelAdmin.designpatterns.factorypattern;

public class RoomFactory {

    public RoomPackage getPackage(String roomPackage) {
        if(roomPackage ==null){
            return null;
        }
        if(roomPackage.equalsIgnoreCase("standard")){
            return new StandardHotelRoom();
        }
        if(roomPackage.equalsIgnoreCase("luxurious")){
            return new LuxuriousRoom();
        }
        if(roomPackage.equalsIgnoreCase("connected")){
            return new ConnectingRooms();
        }
        return null;
    }
}
