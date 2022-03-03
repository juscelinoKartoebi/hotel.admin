package HotelAdmin.Dao;

import HotelAdmin.entities.Booking;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.EmployeeRole;
import HotelAdmin.entities.Guest;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class GuestDao {
    private EntityManager entityManager;

    public GuestDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Guest insert(Guest guest) {
        entityManager.getTransaction().begin();
        entityManager.persist(guest);
        entityManager.getTransaction().commit();
        return guest;
    }

    public int delete(String name, String lastName) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Guest g where g.name = :name and g.lastName = :lastName");
        query.setParameter("name", name).setParameter("lastName", lastName);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }

    public Guest findByGuestName(String name, String lastName) {
        entityManager.getTransaction().begin();
        String jpql = "select g from Guest g where g.name = :name and g.lastName = :lastName";
        TypedQuery<Guest> query = entityManager.createQuery(jpql, Guest.class);
        Guest guest = query.setParameter("name", name).setParameter("lastName", lastName).getSingleResult();
        entityManager.getTransaction().commit();
        return guest;
    }
    public Guest updateGuest(Guest guest) {
        entityManager.getTransaction().begin();
        Guest guestU = entityManager.merge(guest);
        entityManager.getTransaction().commit();
        return guestU;
    }
    public List<Guest> retrieveListOfGuest() {
        entityManager.getTransaction().begin();
        String jpql = "select g from Guest g";
        TypedQuery<Guest> query = entityManager.createQuery(jpql, Guest.class);
        List<Guest> guestList = query.getResultList();
        entityManager.getTransaction().commit();
        return guestList;
    }
    public List<Guest> retrieveListGuestByDistrict(String distr){
        entityManager.getTransaction().begin();
        String jpql = "select g from Guest g where g.district = :distr";
        Query query = entityManager.createQuery(jpql, Guest.class);
        query.setParameter("distr", distr);
        List<Guest> guestList = query.getResultList();
        entityManager.getTransaction().commit();
        return guestList;
    }
}
