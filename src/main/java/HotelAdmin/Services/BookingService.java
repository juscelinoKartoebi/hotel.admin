package HotelAdmin.Services;

import HotelAdmin.entities.Booking;

import java.time.LocalDate;

public interface BookingService {
    Booking insertBooking(LocalDate checkInDate, LocalDate checkOutDate, String status, int numberOfGuest, LocalDate bookingDate);

    Booking findBooking(LocalDate bookinDate);
}
