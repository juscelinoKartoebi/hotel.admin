package HotelAdmin.views;

import HotelAdmin.Patterns.Decorator.*;

public class DecoratorView {
    public void getDecorator(){
        Room romanticRoom = new LovelyRoom(new PoolCard(new PlainRoom()));
        System.out.println("Package: " + romanticRoom.getDescription());
        System.out.println("Total Price: $" + romanticRoom.getCost());

//        System.out.println("");
//
//        Room christmasRoom = new PoolCard(new ChristmasSpecialRoom(new PlainRoom()));
//        System.out.println("Package: " + christmasRoom.getDescription());
//        System.out.println("Total Price: $" + christmasRoom.getCost());
    }
}
