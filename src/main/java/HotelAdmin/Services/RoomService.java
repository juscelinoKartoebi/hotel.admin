package HotelAdmin.Services;

import HotelAdmin.entities.Booking;
import HotelAdmin.entities.HotelInfo;
import HotelAdmin.entities.Room;

import java.util.Set;

public interface RoomService {
    Room insertRoom(String roomType, String roomLocation, Long numberOfBeds, /*HotelInfo hotelInfo, */Set<Booking> booking);
}
