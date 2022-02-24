package HotelAdmin.entities;
import javax.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "booking_number")
    private Long bookingNumber;
    @Column (name = "check_in_date")
    private LocalDate checkInDate;
    @Column (name = "check_out_date")
    private LocalDate checkOutDate;
    @Column (name = "status")
    private String Status;
    @Column (name = "number_of_guest")
    private int numberOfGuest;
    @Column (name = "booking_Date")
    private LocalDate bookingDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "guest_id")
    private Guest guestId;

    public Booking(LocalDate checkInDate, LocalDate checkOutDate, String status, int numberOfGuest, LocalDate bookingDate) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        Status = status;
        this.numberOfGuest = numberOfGuest;
        this.bookingDate = bookingDate;
    }

    public Booking(LocalDate checkInDate, LocalDate checkOutDate, String status, int numberOfGuest, LocalDate bookingDate, Guest guestId) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        Status = status;
        this.numberOfGuest = numberOfGuest;
        this.bookingDate = bookingDate;
        this.guestId = guestId;
    }

    public Booking() {
    }

    @Override
    public String toString() {
        return " \n Booking: " +
                "\n \t checkInDate = " + checkInDate +
                "\n \t checkOutDate = " + checkOutDate +
                "\n \t Status = " + Status +
                "\n \t numberOfGuest = " + numberOfGuest +
                "\n \t bookingDate = " + bookingDate +
                "\n \t guestId = " + guestId;
    }
}
