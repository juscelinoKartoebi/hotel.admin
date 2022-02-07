package HotelAdmin.app;

import HotelAdmin.Configurations.JpaConfiguratie;
import HotelAdmin.Dao.BookingDao;
import HotelAdmin.Dao.EmployeeDao;
import HotelAdmin.Dao.EmployeeRoleDao;
import HotelAdmin.Dao.GuestDao;
import HotelAdmin.Services.*;
import HotelAdmin.designpatterns.chainOfResponsibility.Verlof;
import HotelAdmin.designpatterns.chainOfResponsibility.VerlofChain;
import HotelAdmin.designpatterns.decorator.Candy;
import HotelAdmin.designpatterns.decorator.ChristmasSpecial;
import HotelAdmin.designpatterns.decorator.ChristmasTree;
import HotelAdmin.designpatterns.decorator.RoomType;
import HotelAdmin.entities.Employee;
import HotelAdmin.views.BookingView;
import HotelAdmin.views.EmployeeRoleView;
import HotelAdmin.views.EmployeeView;
import HotelAdmin.views.GuestView;

import java.time.LocalDate;
import java.util.Scanner;

public class Applicatie {
    public static void main(String[] args) {

        Applicatie app = new Applicatie();
        Employee employee = new Employee();
        RoomType room = new ChristmasSpecial();
        RoomType christmas = new ChristmasTree(room);
        RoomType halloween = new Candy(room);

        //Employee
        EmployeeDao employeeDao = new EmployeeDao(JpaConfiguratie.getEntityManager());
        EmployeeService service = new EmployeeServiceImpl(employeeDao);
        EmployeeView employeeView = new EmployeeView(service);
//        employeeView.registerEmployee();
//        employeeView.findEmployeeUsingNameAndLastName();
//        employeeView.deleteEmployee();

        //EmployeeRole
        EmployeeRoleDao employeeRoleDao = new EmployeeRoleDao(JpaConfiguratie.getEntityManager());
        EmployeeRoleService roleService = new EmployeeRoleServiceImpl(employeeRoleDao);
        EmployeeRoleView employeeRoleView = new EmployeeRoleView(roleService);
//        employeeRoleView.insertRole();

        //Booking
        BookingDao bookingDao = new BookingDao(JpaConfiguratie.getEntityManager());
        BookingService bookingService = new BookingServiceImpl(bookingDao);
        BookingView bookingView = new BookingView(bookingService);
//        bookingView.registerBooking();
//        bookingView.findbooking();

        //Guest
        GuestDao guestDao = new GuestDao(JpaConfiguratie.getEntityManager());
        GuestService guestService = new GuestServiceImpl(guestDao);
        GuestView guestView = new GuestView(guestService);
//        guestView.registerGuest();
//        guestView.findEmployeeUsingNameAndLastName();
        guestView.deleteGuest();




//        System.out.println(christmas.getDescription() +
//                " $" + christmas.cost());

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


