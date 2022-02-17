package HotelAdmin.Dao;

import HotelAdmin.entities.Booking;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.Room;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class RoomDao {
    private EntityManager entityManager;

    public RoomDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Room insert(Room room) {
        entityManager.getTransaction().begin();
        entityManager.persist(room);
        entityManager.getTransaction().commit();
        return room;
    }

    public int delete(Long roomNumber) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Room r where r.roomNumber = :roomNumber ");
        query.setParameter("roomNumber", roomNumber);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }

    //    public Room findByRoomNumber(Long roomNumber) {
//        entityManager.getTransaction().begin();
//        String jpql = "select r from Room r where r.roomNumber = :roomNumber";
//        TypedQuery<Room> query = entityManager.createQuery(jpql, Room.class);
//        Room room = query.setParameter("roomNumber", roomNumber).getSingleResult();
//        entityManager.getTransaction().commit();
//        return room;
//    }
    public List<Room> retrieveRoomList() {
        entityManager.getTransaction().begin();
        String jpql = "select r from Room r";
        TypedQuery<Room> query = entityManager.createQuery(jpql, Room.class);
        List<Room> roomList = query.getResultList();
        entityManager.getTransaction().commit();
        return roomList;
    }
}
