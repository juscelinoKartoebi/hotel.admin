package HotelAdmin.Services;

import HotelAdmin.Dao.RoomDao;
import HotelAdmin.entities.Booking;
import HotelAdmin.entities.HotelInfo;
import HotelAdmin.entities.Room;

import java.util.List;
import java.util.Set;

public class RoomServiceImpl implements  RoomService{
    private final RoomDao roomDao;

    public RoomServiceImpl(RoomDao roomDao) {
        this.roomDao = roomDao;
    }

    @Override
    public Room insertRoom(String roomType, String roomLocation, Long numberOfBeds, /*HotelInfo hotelInfo,*/ Set<Booking> booking) {
        Room room = new Room(roomType, roomLocation,numberOfBeds/*, hotelInfo*/, booking);
        Room savedRoom = roomDao.insert(room);
        return savedRoom;
    }

    @Override
    public List<Room> retrieveRoom() {
        List<Room> roomList = roomDao.retrieveRoomList();
        return roomList;
    }
}
