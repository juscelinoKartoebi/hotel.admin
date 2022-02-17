package HotelAdmin.entities;

import javax.persistence.*;
 
@Entity
@Table(name = "room_booking")
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_booking_id")
    private Long roomBookingId;
    @ManyToOne
    @JoinColumn(name = "room_number")
    private Room roomNumber;
    @ManyToOne
    @JoinColumn(name = "booking_number")
    private Booking bookinNumber;

    public Booking getBookinNumber() {
        return bookinNumber;
    }
    public Room getRoomNumber() {
        return roomNumber;
    }
    public Long getRoomBookingId() {
        return roomBookingId;
    }
    public void setRoomBookingId(Long roomBookingId) {
        this.roomBookingId = roomBookingId;
    }
    public void setRoomNumber(Room roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void setBookinNumber(Booking bookinNumber) {
        this.bookinNumber = bookinNumber;
    }
}
