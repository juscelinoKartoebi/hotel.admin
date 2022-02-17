package HotelAdmin.views;

import HotelAdmin.Configurations.JpaConfiguratie;
import HotelAdmin.Dao.RoomDao;
import HotelAdmin.Services.HotelInfoService;
import HotelAdmin.Services.RoomService;
import HotelAdmin.entities.HotelInfo;
import HotelAdmin.entities.Room;

import java.util.List;
import java.util.Scanner;

public class RoomView {
//    private final RoomService roomService;
//    private final HotelInfoService hotelInfoService;
    RoomDao roomDao = new RoomDao(JpaConfiguratie.getEntityManager());

//    public RoomView(RoomService roomService, HotelInfoService hotelInfoService) {
//        this.roomService = roomService;
//        this.hotelInfoService = hotelInfoService;
//    }

    public RoomView() {

    }

    //    public void insertRoom() {
//        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println("Fill in number of beds available");
//            int numberOfBeds = scanner.nextInt();
//            System.out.println("Please enter location number of room");
//            String roomLocation = scanner.next();
//            System.out.println("Please enter roomtype");
//            String roomType = scanner.next();
//
////            List<HotelInfo> hotelInfoList = hotelInfoService.retrieveList();
////            for (int i = 0; i < hotelInfoList.size(); i++) {
////                if (i == 0) {
////                    System.out.println("Type 1 " + "for " + hotelInfoList.get(i).getHotelName());
////                    continue;
////                }
////                System.out.println("Type " + (i + 1) + " for " + hotelInfoList.get(i).getHotelName());
////            }
////            System.out.println("Please select a hotel");
////            String hotelInfo = scanner.next();
//
//            Room insertedRoom = roomService.insertRoom(roomType, roomLocation,numberOfBeds/*, hotelInfo*/, booking);
//            System.out.println(insertedRoom);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public void getAllRooms(){
        List<Room> roomList = roomDao.retrieveRoomList();
        for(Room room : roomList){
            System.out.println(room);
        }
    }
}
