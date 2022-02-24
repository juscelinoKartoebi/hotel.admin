package HotelAdmin.Services;

import HotelAdmin.entities.Booking;
import HotelAdmin.entities.Guest;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    Booking insertBooking(LocalDate checkInDate, LocalDate checkOutDate, String status, int numberOfGuest, Guest guest);

    Booking findBooking(LocalDate bookinDate);

    List<Booking> findBookingsByKwartaal(Integer year, Integer period);

    List<Booking> findBookingsByYear(Integer year);
}
