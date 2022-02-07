package HotelAdmin.Dao;

import HotelAdmin.entities.Booking;
import HotelAdmin.entities.Guest;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Date;

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
}
