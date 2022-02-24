package HotelAdmin.Services;

import HotelAdmin.Dao.BookingDao;
import HotelAdmin.entities.Booking;
import HotelAdmin.entities.Guest;

import java.time.LocalDate;
import java.util.List;

public class BookingServiceImpl implements BookingService {
    private final BookingDao bookingDao;

    public BookingServiceImpl(BookingDao bookingDao) {
        this.bookingDao = bookingDao;
    }
    @Override
    public Booking insertBooking(LocalDate checkInDate, LocalDate checkOutDate, String status, int numberOfGuest, Guest guest) {
        Booking booking = new Booking(checkInDate,
                checkOutDate,
                status,
                numberOfGuest,
                LocalDate.now(),
                guest);
        Booking savedBooking = bookingDao.insert(booking);
        return savedBooking;
    }

    @Override
    public Booking findBooking(LocalDate bookinDate) {
        return bookingDao.findByBookingDate(bookinDate);
    }

    @Override
    public List<Booking> findBookingsByKwartaal(Integer year, Integer period) {
        return bookingDao.findBookingsByKwartaal(year, period);
    }

    @Override
    public List<Booking> findBookingsByYear(Integer year) {
        return bookingDao.findBookingByYear(year);
    }

}
