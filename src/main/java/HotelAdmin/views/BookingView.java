package HotelAdmin.views;

import HotelAdmin.Services.BookingService;
import HotelAdmin.entities.Booking;
import HotelAdmin.entities.Employee;

import java.time.LocalDate;
import java.util.Scanner;

public class BookingView {
    private final BookingService bookingService;

    public BookingView(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public void registerBooking(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter checkIn date ");
            LocalDate checkInDate = LocalDate.parse(scanner.next());
            System.out.println("Please enter checkout date");
            LocalDate checkOutDate = LocalDate.parse(scanner.next());
            System.out.println("Please enter status");
            String status = scanner.next();
            System.out.println("Please enter number of guests");
            int numberOfGuest = Integer.parseInt(scanner.next());
            System.out.println("Please enter current date");
            LocalDate bookingDate = LocalDate.parse(scanner.next());

            Booking insertedBooking = bookingService.insertBooking(checkInDate,
                    checkOutDate,
                    status,
                    numberOfGuest,
                    bookingDate);
            System.out.println(insertedBooking);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void findbooking(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter date of booking");
            LocalDate bookingDate = LocalDate.parse(scanner.next());

            Booking bookedByDate = bookingService.findBooking(bookingDate);
            System.out.println(bookedByDate);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

