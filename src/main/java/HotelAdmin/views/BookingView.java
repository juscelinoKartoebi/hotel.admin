package HotelAdmin.views;

import HotelAdmin.Services.BookingService;
import HotelAdmin.Services.GuestService;
import HotelAdmin.entities.Booking;
import HotelAdmin.entities.Guest;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BookingView {
    private final BookingService bookingService;
    private final GuestService guestService;

    public BookingView(BookingService bookingService, GuestService guestService) {
        this.bookingService = bookingService;
        this.guestService = guestService;
    }

    public void registerBooking() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter checkIn date ");
            LocalDate checkInDate = LocalDate.parse(scanner.next());
            System.out.println("Please enter checkout date");
            LocalDate checkOutDate = LocalDate.parse(scanner.next());
            System.out.println("Please enter status");
            String status = scanner.next();
            System.out.println("Please enter number of guests");
            int numberOfGuest = Integer.parseInt(scanner.next());

            System.out.println("Please enter name");
            String name = scanner.next();
            System.out.println("Please enter lastname");
            String lastName = scanner.next();
            Guest guest = guestService.findGuest(name, lastName);

            Booking insertedBooking = bookingService.insertBooking(checkInDate,
                    checkOutDate,
                    status,
                    numberOfGuest, guest);
            System.out.println(insertedBooking);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findbooking() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter date of booking");
            LocalDate bookingDate = LocalDate.parse(scanner.next());

            Booking bookedByDate = bookingService.findBooking(bookingDate);
            System.out.println(bookedByDate);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findBookingsByKwartaal() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the year");
            Integer year = scanner.nextInt();
            System.out.println("Please enter a quarter");
            Integer period = scanner.nextInt();
            List<Booking> bookings = bookingService.findBookingsByKwartaal(year, period);
            for(Booking booking : bookings){
                System.out.println(booking.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void findBookingsByYear(){
        {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Please enter the year");
                Integer year = scanner.nextInt();
                List<Booking> bookings = bookingService.findBookingsByYear(year);
                for(Booking booking : bookings){
                    System.out.println(booking.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}