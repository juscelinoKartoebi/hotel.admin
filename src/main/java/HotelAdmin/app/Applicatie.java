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
        BookingDao bookingDao = new BookingDao(JpaConfiguratie.getEntityManager());
        BookingService bookingService = new BookingServiceImpl(bookingDao);
        EmployeeDao employeeDao = new EmployeeDao(JpaConfiguratie.getEntityManager());
        EmployeeService service = new EmployeeServiceImpl(employeeDao);
        GuestDao guestDao = new GuestDao(JpaConfiguratie.getEntityManager());
        GuestService guestService = new GuestServiceImpl(guestDao);
        EmployeeRoleDao employeeRoleDao = new EmployeeRoleDao(JpaConfiguratie.getEntityManager());
        EmployeeRoleService roleService = new EmployeeRoleServiceImpl(employeeRoleDao);
        BillingDao billingDao = new BillingDao(JpaConfiguratie.getEntityManager());
        BillingService billingService = new BillingServiceImpl(billingDao);
        HotelInfoDao hotelInfoDao = new HotelInfoDao(JpaConfiguratie.getEntityManager());
        HotelInfoService hotelInfoService = new HotelInfoServiceImpl(hotelInfoDao);

        Applicatie app = new Applicatie();
        Employee employee = new Employee();

        RoomType room = new ChristmasSpecial();
        RoomType christmas = new ChristmasTree(room);
        RoomType halloween = new Candy(room);

//        Employee
        EmployeeView employeeView = new EmployeeView(service, hotelInfoService, roleService);
//        employeeView.registerEmployee();
//        employeeView.findEmployeeUsingNameAndLastName();
//        employeeView.deleteEmployee();
//        employeeView.updateEmpl();

//        EmployeeRole
        EmployeeRoleView employeeRoleView = new EmployeeRoleView(roleService);
//        employeeRoleView.insertRole();

//        Booking
        BookingView bookingView = new BookingView(bookingService, guestService);
//        bookingView.registerBooking();
//        bookingView.findbooking();

//        Guest
        GuestView guestView = new GuestView(guestService);
//        guestView.registerGuest();
//        guestView.findEmployeeUsingNameAndLastName();
//        guestView.deleteGuest();

//        Bill
        BillingView billingView = new BillingView(billingService);
//        billingView.registerBill();
//

//
//        Scanner scanner = new Scanner(System.in);
//        RoomFactory roomFactory = new RoomFactory();
//        System.out.println("Test");
//        String input = scanner.next();
//         roomFactory.getPackage(input).loadRoomPackage();



        System.out.println(christmas.getDescription() +
                " $" + christmas.cost());
        //        app.factoryPattern();

//        Delete
//        Employee foundDeletedEmployee = employeeDao.findByName("Lino");
//        int totalRecordsDeleted = employeeDao.delete("Lino");
//        System.out.println(totalRecordsDeleted);
//        System.out.println(foundDeletedEmployee);

//        Ophaal
//        EmployeeDao ordersDao = new EmployeeDao(JpaConfiguratie.getEntityManager());
//        List<Employee> employeeList = ordersDao.retrieveEmployeeList();
//        employeeList.stream().forEach(System.out::println);
//        for (Employee orders : employeeList) {
//        System.out.println(orders);
//        }

//        Update

//        Employee foundEmployee = employeeDao.findByEmplName("John");
//        savedEmployee.setName(foundEmployee.getName());
//        System.out.println(foundEmployee);
//        foundEmployee.setName("Kim");
//        int updatedRecords = employeeDao.updateEmployee(foundEmployee);
//        System.out.println(updatedRecords);
//        System.out.println(foundEmployee);
//------------------------------------------------------------------------------------
//        Booking Dao*
//        Booking booking = new Booking( LocalDate.now(), LocalDate.parse("2007-12-15"), "geboekt", 6, LocalDate.parse("2007-12-03"));
//        Booking savedBooking = bookingDao.insert(booking);
//        System.out.println(savedBooking);

//            JpaConfiguratie.shutdown();
//    }


//    public String roomCheck(String input){
//        String roomType;
//        RoomType room = new ChristmasSpecial();
//        RoomType christmas = new ChristmasTree(room);
//        RoomType halloween = new Candy(room);
//
//        if(RoomType.class.equals(input))
//            return room;
//        return room;
//    }
//private void factoryPattern(){
//    RoomFactory roomFactory = new RoomFactory();
//
//    RoomPackage room1 = roomFactory.getPackage("standard");
//    room1.loadRoomPackage();
//
//    RoomPackage room2 = roomFactory.getPackage("connected");
//    room2.loadRoomPackage();
//
//    RoomPackage room3 = roomFactory.getPackage("luxurious");
//    room3.loadRoomPackage();
//
//}
    }
}


