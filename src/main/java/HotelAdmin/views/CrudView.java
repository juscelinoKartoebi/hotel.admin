package HotelAdmin.views;

import HotelAdmin.Configurations.JpaConfiguratie;
import HotelAdmin.Dao.*;
import HotelAdmin.Services.*;

import java.util.Scanner;

public class CrudView {
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

    EmployeeView employeeView = new EmployeeView(service, hotelInfoService, roleService);
    EmployeeRoleView employeeRoleView = new EmployeeRoleView(roleService);
    BookingView bookingView = new BookingView(bookingService, guestService);
    GuestView guestView = new GuestView(guestService);
    BillingView billingView = new BillingView(billingService, guestService);
//    RoomView roomView = new RoomView(roo);

    public void crudHandelingen(){
        System.out.println(" Press #1.Register employee      Press #2.Search employee       Press #3.Update employee       Press #4. Delete employee");
        System.out.println(" Press #5.Register guest         Press #6.Search guest          Press #7.Update guest          Press #8.Delete guest");
        System.out.println(" Press #9.Insert new role        Press #10.Search up a role     Press #11.Update a role        Press #12.Delete a role");
        System.out.println(" Press #13.Insert new booking    Press #14.Search a booking     Press #15.Update a booking     Press #16.Delete booking");
        System.out.println(" Press #17.Write new bill        Press #18.Retrieve bill        Press #19.Update bill          Press #20.retrieve all guests info");
        System.out.println(" Press #21.Retrieve all Room_bookings");
    Scanner scan1 = new Scanner(System.in);
    int choice = scan1.nextInt();
        switch(choice) {
            case 1:
                employeeView.registerEmployee();
                break;
            case 2:
                employeeView.findEmployeeUsingNameAndLastName();
                break;
            case 3:
                employeeView.updateEmpl();
                break;
            case 4:
                employeeView.deleteEmployee();
                break;
            case 5:
                guestView.registerGuest();
                break;
            case 6:
                guestView.findEmployeeUsingNameAndLastName();
                break;
            case 7:
                guestView.updateGuestU();
                break;
            case 8:
                guestView.deleteGuest();
                break;
            case 9:
                employeeRoleView.insertRole();
                break;
            case 13:
                bookingView.registerBooking();
                break;
            case 14:
                bookingView.findbooking();
                break;
            case 17:
                billingView.registerBill();
                break;

            case 20:
                guestView.getAllGuests();
                break;
            case 21:
                RoomView roomView = new RoomView();
                roomView.getAllRooms();
                break;
            case 22:
                bookingView.findBookingsByKwartaal();
                break;
            case 23:
                bookingView.findBookingsByYear();
                break;
            case 24:
                guestView.getGuestsRapportageByDistrict();
                break;



        }
    }
}
