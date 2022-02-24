package HotelAdmin.views;

import HotelAdmin.Configurations.JpaConfiguratie;
import HotelAdmin.Dao.GuestDao;
import HotelAdmin.Services.GuestService;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.Guest;
import HotelAdmin.entities.Room;

import java.util.List;
import java.util.Scanner;

public class GuestView {
    private final GuestService guestService;
    GuestDao guestDao = new GuestDao(JpaConfiguratie.getEntityManager());

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

    public void findEmployeeUsingNameAndLastName() {
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

    public void deleteGuest() {
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

    public void updateGuestU() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter guest name");
            String name = scanner.next();
            System.out.println("Please enter guest lastname");
            String lastName = scanner.next();

            Guest guestByName = guestService.findGuest(name, lastName);
            System.out.println("Please enter new name");
            String newName = scanner.next();
            System.out.println("Please enter new lastname");
            String newLastName = scanner.next();
            System.out.println("PLease enter new Adress");
            String newAdress = scanner.next();
            System.out.println("please enter new Phone");
            String newPhone = scanner.next();

            guestByName.setName(newName);
            guestByName.setLastName(newLastName);
            guestByName.setAdress(newAdress);
            guestByName.setPhone(newPhone);
            Guest guest = guestService.updateGuest(guestByName);
            System.out.println("Updated " + guest);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void getAllGuests() {
        List<Guest> guestList = guestDao.retrieveListOfGuest();
        for (Guest guest : guestList) {
            System.out.println(guest);
        }
    }
}
