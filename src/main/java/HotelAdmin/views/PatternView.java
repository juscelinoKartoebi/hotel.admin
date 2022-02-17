package HotelAdmin.views;

import HotelAdmin.Patterns.factorypattern.RoomFactory;

import java.util.Scanner;

public class PatternView {
    public void factoryPattern() {
        Scanner scanner = new Scanner(System.in);
        RoomFactory roomFactory = new RoomFactory();
        System.out.println("U can choose between: standard, luxurious or connected room ");
        String input = scanner.next();
        roomFactory.getPackage(input).loadRoomPackage();
    }
}
