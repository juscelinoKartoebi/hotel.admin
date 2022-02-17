package HotelAdmin.views;

import HotelAdmin.Patterns.Decorator.LovelyRoom;
import HotelAdmin.Patterns.Decorator.Room;
import HotelAdmin.Patterns.Decorator.PlainRoom;
import HotelAdmin.Patterns.Decorator.PoolCard;

public class DecoratorView {
    public void getDecorator(){
        Room romanticRoom = new PoolCard(new LovelyRoom(new PlainRoom()));
        System.out.println("Package: " + romanticRoom.getDescription());
        System.out.println("Total Price: " + romanticRoom.getCost());
    }
}
