package HotelAdmin.app;

import HotelAdmin.Configurations.JpaConfiguratie;
import HotelAdmin.Dao.*;
import HotelAdmin.Services.*;
import HotelAdmin.designpatterns.decorator.Candy;
import HotelAdmin.designpatterns.decorator.ChristmasSpecial;
import HotelAdmin.designpatterns.decorator.ChristmasTree;
import HotelAdmin.designpatterns.decorator.RoomType;
import HotelAdmin.designpatterns.factorypattern.ConnectingRooms;
import HotelAdmin.designpatterns.factorypattern.LuxuriousRoom;
import HotelAdmin.designpatterns.factorypattern.RoomFactory;
import HotelAdmin.designpatterns.factorypattern.StandardHotelRoom;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.HotelInfo;
import HotelAdmin.views.*;

import java.util.Scanner;

public class Applicatie {
    public static void main(String[] args) {

        Applicatie app = new Applicatie();
        Employee employee = new Employee();

        RoomType room = new ChristmasSpecial();
        RoomType christmas = new ChristmasTree(room);
        RoomType halloween = new Candy(room);

//        CrudHandelingen
        CrudView crudView = new CrudView();
        crudView.crudHandelingen();

//        FactoryPattern
//        Scanner scanner = new Scanner(System.in);
//        RoomFactory roomFactory = new RoomFactory();
//        System.out.println("U can choose between a: standard, luxurious or connected room ");
//        String input = scanner.next();
//        roomFactory.getPackage(input).loadRoomPackage();

//        DecoratorPattern
//        System.out.println(halloween.getDescription() +
//                " $" + christmas.cost());
//        app.factoryPattern();

        JpaConfiguratie.shutdown();
        }
}


