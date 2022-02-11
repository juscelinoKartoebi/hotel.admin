package HotelAdmin.views;

import HotelAdmin.Services.GuestService;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.Guest;

import java.util.Scanner;

public class GuestView {
    private final GuestService guestService;

    public GuestView(GuestService guestService) {
        this.guestService = guestService;
    }

    public void registerGuest() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter guest name");
            String name = scanner.next();
            System.out.println("Please enter guest lastname");
            String lastName = scanner.next();
            System.out.println("Please enter guest phone number");
            String phone = scanner.next();
            System.out.println("Please enter guest adress");
            String adress = scanner.next();

            Guest insertedGuest = guestService.insertGuest(name, lastName, phone, adress);
            System.out.println(insertedGuest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void findEmployeeUsingNameAndLastName(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter guest name");
            String name = scanner.next();
            System.out.println("Please enter guest lastname");
            String lastName = scanner.next();

            Guest guestByNameAndLastName = guestService.findGuest(name, lastName);
            System.out.println(guestByNameAndLastName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteGuest(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter guest name");
            String name = scanner.next();
            System.out.println("Please enter guest lastname");
            String lastName = scanner.next();

            Guest guestByNameAndLastName = guestService.deleteGuest(name, lastName);
            System.out.println(guestByNameAndLastName);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
