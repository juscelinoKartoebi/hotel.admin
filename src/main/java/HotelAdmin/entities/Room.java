package HotelAdmin.entities;

 

import javax.persistence.*;
import java.util.Set;

 
@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_number")
    private Long roomNumber;
    @Column (name = "room_type")
    private String roomType;
    @Column (name = "room_location")
    private String roomLocation;
    @Column (name = "number_of_beds")
    private Long numberOfBeds;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn (name = "hotel_id")
//    private HotelInfo hotelInfo;
    @ManyToMany
    @JoinTable(name = "room_booking",
    joinColumns = {@JoinColumn(name = "room_number")},
            inverseJoinColumns =
                    {@JoinColumn (name = "booking_number")})
    private Set<Booking> booking;

    public Room(String roomType, String roomLocation,Long numberOfBeds,/* HotelInfo hotelInfo,*/ Set<Booking> booking) {
        this.roomType = roomType;
        this.roomLocation = roomLocation;
        this.numberOfBeds = numberOfBeds;
//        this.hotelInfo = hotelInfo;
        this.booking = booking;
    }

    public Room() {
    }

    public Long getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public String getRoomLocation() {
        return roomLocation;
    }
    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }
    public Long getNumberOfBeds() {
        return numberOfBeds;
    }
    public void setNumberOfBeds(Long numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
//    public HotelInfo gethotelInfo() {
//        return hotelInfo;
//    }
//    public void setHotelId(HotelInfo hotelInfo) {
//        this.hotelInfo = hotelInfo;
//    }

    @Override
    public String toString() {
        return "Room: " +
                "\n \t roomType=" + roomType +
                "\n \t roomLocation = " + roomLocation +
                "\n \t numberOfBeds = " + numberOfBeds +
//                "\n \t hotelInfo = " + hotelInfo +
                "\n \t booking = " + booking;
    }
}
