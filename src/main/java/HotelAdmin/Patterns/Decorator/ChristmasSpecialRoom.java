package HotelAdmin.Patterns.Decorator;

public class ChristmasSpecialRoom extends RoomDecorator {
    public ChristmasSpecialRoom(Room newRoom) {
        super(newRoom);
        System.out.println("Adding Christmas tree");
        System.out.println("Adding Christmas decorations");
    }
    public String getDescription(){
        return tempRoom.getDescription() + ", Christmas decorations";
    }
    public double getCost(){
        System.out.println("Cost of Christmas decorations: $" + 15.50);

        return tempRoom.getCost() + 15.50;
    }
}
