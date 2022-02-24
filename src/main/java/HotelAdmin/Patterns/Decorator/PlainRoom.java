package HotelAdmin.Patterns.Decorator;

public class PlainRoom implements Room {

    //dit is gewoon een basic room
    public String getDescription() {
        return "Room";
    }
    public double getCost() {
        System.out.println("Cost of Room: $" + 50.00);
        return 50.00;
    }
}
