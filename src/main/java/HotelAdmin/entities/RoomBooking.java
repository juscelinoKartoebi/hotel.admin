package HotelAdmin.entities;

 

import javax.persistence.*;

 
@Entity
@Table(name = "room_booking")
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_booking_id")
    private Long roomBookingId;

//    private Room roomNumber;
//    private Booking bookinNumber;

    public Long getRoomBookingId() {
        return roomBookingId;
    }
    public void setRoomBookingId(Long roomBookingId) {
        this.roomBookingId = roomBookingId;
    }
//    public Room getRoomNumber() {
//        return roomNumber;
//    }
//    public void setRoomNumber(Room roomNumber) {
//        this.roomNumber = roomNumber;
//    }
//    public Booking getBookinNumber() {
//        return bookinNumber;
//    }
//    public void setBookinNumber(Booking bookinNumber) {
//        this.bookinNumber = bookinNumber;
//    }
}
